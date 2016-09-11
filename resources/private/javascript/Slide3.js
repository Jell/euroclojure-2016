import RaisedButton from 'material-ui/RaisedButton';

var Slide3 = ({children, callback}) =>
    <div>
      <h1>Solution 3: JSX foreign lib</h1>
      <RaisedButton label="Click Me!" onClick={callback} />
      {children}
    </div>;

module.exports = Slide3;
