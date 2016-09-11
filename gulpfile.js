var exec       = require('child_process').exec;
var gulp       = require('gulp');
var sass       = require('gulp-sass');
var shell      = require('gulp-shell');
var sourcemaps = require('gulp-sourcemaps');
var watch      = require('gulp-watch');

// Webpack build
gulp.task('build-webpack-prod', shell.task([
  'webpack --config ./webpack.prod.config.js'
]))

gulp.task('build-webpack-dev', shell.task([
  'webpack --config ./webpack.dev.config.js'
]))

gulp.task('watch-webpack-dev', ['build-webpack-dev'], shell.task([
  'webpack --config ./webpack.dev.config.js --watch'
]))

// CLJS build
gulp.task('build-cljs-prod', ['build-webpack-prod'], shell.task([
  'lein cljsbuild once min'
]));

gulp.task('watch-cljs-dev', ['build-webpack-dev'], shell.task([
  'lein figwheel'
]));

// Template watch
var reloadCljsTemplate = function (file) {
  templateName = file.path.split("/").pop();
  exec(
    "grep -rnwl 'src/' -e '"+templateName+"' | xargs touch"
  );
};

gulp.task('watch-kioo-templates', function() {
  gulp.watch(
    'resources/private/templates/**/*'
  ).on("change", reloadCljsTemplate);
});


// SASS build
var includeSassPaths = ["resources/private/sass"];
var mainSassFile = 'resources/private/sass/app.scss';
var publicCssFolder = 'resources/public/css';
gulp.task('build-sass-prod', function() {
  return gulp.src(mainSassFile)
    .pipe(sourcemaps.init())
    .pipe(
      sass.sync({
        outputStyle: 'compressed',
        sourceComments: false,
        includePaths: includeSassPaths
      }))
    .pipe(sourcemaps.write('.', {sourceMappingURLPrefix: '/css'}))
    .pipe(gulp.dest(publicCssFolder));
});

gulp.task('build-sass-dev', function() {
  return gulp.src(mainSassFile)
    .pipe(
      sass.sync({
        sourceComments: true,
        includePaths: includeSassPaths
      }).on('error', sass.logError))
    .pipe(gulp.dest(publicCssFolder));
});

gulp.task('watch-dev-sass', ['build-sass-dev'], function() {
  gulp.watch('resources/private/**/*.{scss,css,sass}', ['build-sass-dev']);
});

// Aliases
gulp.task('clean', shell.task([
  'lein clean',
  'rm -rf resources/public/css/app.css',
  'rm -rf resources/webpack'
]))

gulp.task('dev', ['watch-dev-sass',
                  'watch-cljs-dev',
                  'watch-kioo-templates',
                  'watch-webpack-dev']);

gulp.task('prod', ['build-sass-prod',
                   'build-webpack-prod',
                   'build-cljs-prod']);


gulp.task('deploy', shell.task([
  "git checkout master",
  "git pull",
  "rm -rf docs",
  "gulp clean",
  "gulp prod",
  "cp -r resources/public ./docs",
  "git add docs/*",
  "git commit -m 'Deploy'",
  "git push"
]));
