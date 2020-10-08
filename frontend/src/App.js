import React, { Component } from "react";
import AddEmployee from "./Components/Employee/AddEmployee";
import { Route, BrowserRouter as Router } from "react-router-dom";
import Table from "./Components/Employee/Table";
import Department from "./Components/Department/Department"

class App extends Component {
  render() {
    return (
      <Router>
        <Route exact path="/" component={AddEmployee} />
        <Route exact path="/view" component={Department} />
      </Router>
    );
  }
}

export default App;
