import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import {deepOrange500} from 'material-ui/styles/colors';

window.MuiThemeProvider = MuiThemeProvider;

window.MuiTheme = getMuiTheme({
  palette: {
    textColor: "#0000FF",
    accent1Color: deepOrange500,
  },
});

window.MyAwesomeReactComponent = require("./MyAwesomeReactComponent.js");
