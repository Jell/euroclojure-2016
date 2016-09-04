import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import RaisedButton from 'material-ui/RaisedButton';
import {deepOrange500} from 'material-ui/styles/colors';

window.MyAwesomeReactComponent = require('./MyAwesomeComponent.js');
window.MuiThemeProvider = MuiThemeProvider;
window.RaisedButton = RaisedButton;

window.MuiTheme = getMuiTheme({
  palette: {
    textColor: "#0000FF",
    accent1Color: deepOrange500,
  },
});
