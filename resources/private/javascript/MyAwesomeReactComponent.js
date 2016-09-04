import RaisedButton from 'material-ui/RaisedButton';

var MyAwesomeReactComponent = ({titles, callback}) =>
  <div>
    {titles.map((title, i) =>
      <RaisedButton key={i}label={title} onClick={() => callback(title)}/>
    )}
  </div>;

module.exports = MyAwesomeReactComponent;
