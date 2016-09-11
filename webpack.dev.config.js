const webpack = require('webpack');
const config = require('./webpack.common.config.js');

config['plugins'] = [
  new webpack.DefinePlugin({}),
  new webpack.NoErrorsPlugin()
];

module.exports = config;
