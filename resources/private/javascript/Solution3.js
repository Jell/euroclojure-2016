import RaisedButton from 'material-ui/RaisedButton';

var Solution3 = ({children, callback}) =>
  <div className="slide-padding">
    <h1>Solution 3: JSX foreign lib</h1>
    <RaisedButton label="Click Me!" onClick={callback} />
    {children}
  </div>;

module.exports = Solution3;
