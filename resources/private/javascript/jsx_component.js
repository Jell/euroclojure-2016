import ActionFlightTakeoff from 'material-ui/svg-icons/action/flight-takeoff';
var theBloodOfAngryMen="red", theDarkOfAgesPast="black";

var JSXComponent = ({children, saysWhat}) =>
  <div className="slide">
    <div className="demo-container">
      <ActionFlightTakeoff color={theBloodOfAngryMen}/>
      <span> JSX + babel + webpack + Material UI say: </span>
      <b>{saysWhat}</b>
    </div>
    {children}
  </div>;

module.exports = JSXComponent;
