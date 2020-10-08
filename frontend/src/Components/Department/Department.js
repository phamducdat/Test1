import React, { useState } from "react";
import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import { Link } from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import { makeStyles } from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";

const useStyles = makeStyles(theme => ({
  paper: {
    marginTop: theme.spacing(7),
    display: "flex",
    flexDirection: "column",
    alignItems: "center"
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main
  },
  form: {
    width: "100%", // Fix IE 11 issue.
    marginTop: theme.spacing(3)
  },
  submit: {
    margin: theme.spacing(3, 0, 2)
  },
  textField: {
    marginLeft: theme.spacing(1),
    marginRight: theme.spacing(1),
    width: "100%"
  }
}));

function Department(props){
    const [fieldDepartmentName, setFieldDepartmentName] = useState();
    const [fieldDepartmentId, setFieldDepartmentId] = useState();

    const inputCreateDepartment = {
        departmentName:fieldDepartmentName,
        departmentId:fieldDepartmentId
    };	
    
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json'},
        body: JSON.stringify(inputCreateDepartment)
    };


    const handleClick = () => {		
		fetch('api/create-department', requestOptions)
        .then(response => response.json())
        .then(response => {
			console.log('rs = ' + response);
			
		});
    }
    
    const handleChangeDeparmentName = (e) => {
		setFieldDepartmentName(e.target.value);
    };
    
    const handleChangeDeparmentId = (e) => {
		setFieldDepartmentId(e.target.value);
    };
    
    return(
		<div>
			<input type="text" value={fieldDepartmentName} onChange={handleChangeDeparmentName}/>
            
			<input type="text" value={fieldDepartmentId} onChange={handleChangeDeparmentId}/>
			<button onClick={handleClick}>Thêm mới phòng</button>
		
		</div>
	);
}

export default Department;