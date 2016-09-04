import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import RaisedButton from 'material-ui/RaisedButton';
import {deepOrange500} from 'material-ui/styles/colors';

window.MuiThemeProvider = MuiThemeProvider;
window.RaisedButton = RaisedButton;

window.MuiTheme = getMuiTheme({
  palette: {
    textColor: "#000000",
    accent1Color: deepOrange500,
  },
});

window.MyAwesomeReactComponent = ({titles, callback, others}) =>
  <div>
    <h1>Yo?</h1>
    <pre>{JSON.stringify(others)}</pre>
    {titles.map((title, i) =>
      <RaisedButton key={i} label={title} onClick={() => callback(title)}/>
    )}
  </div>;
