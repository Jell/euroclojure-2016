const webpack = require('webpack');
const path = require('path');
const buildPath = path.resolve(__dirname, 'resources/webpack');
const nodeModulesPath = path.resolve(__dirname, 'node_modules');

const config = {
  entry: [path.join(__dirname,
                    'resources',
                    'private',
                    'javascript',
                    'entry.js')],
  // Render source-map file for final build
  devtool: 'source-map',
  // output config
  output: {
    path: buildPath, // Path of output file
    filename: 'bundle.js', // Name of output file
  },
  plugins: [
    // Define production build to allow React to strip out unnecessary checks
    new webpack.DefinePlugin({
      // 'process.env':{
      //   'NODE_ENV': JSON.stringify('production')
      // }
    }),
    // Minify the bundle
    // new webpack.optimize.UglifyJsPlugin({
    //   compress: {
    //     // suppresses warnings, usually from module minification
    //     warnings: false,
    //   },
    // }),
    // Allows error warnings but does not stop compiling.
    new webpack.NoErrorsPlugin()
  ],
  externals: {
    'react': 'React',
    'react-dom': 'ReactDOM',
    'react/lib/ReactFragment': 'React.addons.createFragment',
    'react/lib/ReactTransitionGroup': 'React.addons.TransitionGroup',
    'react/lib/EventPluginHub':
    'react/lib/EventConstants':
    'react/lib/EventPluginUtils':
    'react/lib/EventPropagators':
    'react/lib/SyntheticUIEvent':
    'react/lib/ViewportMetrics':

  },
  module: {
    loaders: [
      {
        test: /\.js$/, // All .js files
        loader: ['babel'],
        exclude: [nodeModulesPath],
        query: {
          presets: ['es2015', 'react']
        }
      },
    ],
  },
};

module.exports = config;
