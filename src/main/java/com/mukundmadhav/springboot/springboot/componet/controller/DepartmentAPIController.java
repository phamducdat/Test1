package com.mukundmadhav.springboot.springboot.componet.controller;

import com.mukundmadhav.springboot.springboot.componet.entity.Department;
import com.mukundmadhav.springboot.springboot.componet.model.CreateDepartmentInputModel;
import com.mukundmadhav.springboot.springboot.componet.service.DepartmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController
@RequestMapping("/api")
public class DepartmentAPIController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create-department")
    public ResponseEntity<?> createDepatment(@RequestBody CreateDepartmentInputModel input){
        log.info("ok");
        Department dept = departmentService.save(input.getDepartmentId(), input.getDepartmentName());
        return ResponseEntity.ok().body(dept);
    }
}
