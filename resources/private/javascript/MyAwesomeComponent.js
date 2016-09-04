import RaisedButton from 'material-ui/RaisedButton';

MyAwesomeReactComponent = ({titles, callback, others}) =>
  <div>
    <h1>Yo?</h1>
    <pre>{JSON.stringify(others)}</pre>
    {titles.map((title, i) =>
      <RaisedButton key={i} label={title} onClick={() => callback(title)}/>
    )}
  </div>;

module.exports = MyAwesomeReactComponent;
