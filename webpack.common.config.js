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
  plugins: [],
  externals: {
    'react': 'React',
    'react-dom': 'ReactDOM',
    'react/lib/ReactFragment': 'React.addons.createFragment',
    'react/lib/ReactTransitionGroup': 'React.addons.TransitionGroup'
  },
  module: {
    loaders: [
      {
        test: /\.js$/, // All .js files
        loader: 'babel',
        exclude: [nodeModulesPath],
        query: {
          presets: ['es2015', 'react']
        }
      }
    ]
  },
};

module.exports = config;
