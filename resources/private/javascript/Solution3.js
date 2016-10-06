import RaisedButton from 'material-ui/RaisedButton';

var Solution3 = ({children, callback}) =>
  <div className="slide">
    <h2>Solution 3: JSX foreign lib</h2>
    <div className="demo-container">
      <RaisedButton className="big-button" label="Click Me!" onClick={callback} />
    </div>
    {children}
  </div>;

module.exports = Solution3;
