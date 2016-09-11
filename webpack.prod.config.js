const webpack = require('webpack');
const config = require('./webpack.common.config.js');

config['plugins'] = [
  // Define production build to allow React to strip out unnecessary checks
  new webpack.DefinePlugin({
    'process.env':{
      'NODE_ENV': JSON.stringify('production')
    }
  }),
  // Minify the bundle
  new webpack.optimize.UglifyJsPlugin({
    compress: {
      // suppresses warnings, usually from module minification
      warnings: false,
    },
  }),
];

module.exports = config;
