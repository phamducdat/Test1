package com.mukundmadhav.springboot.springboot.componet.service;

import com.mukundmadhav.springboot.springboot.componet.entity.Department;
import com.mukundmadhav.springboot.springboot.componet.repo.DepartmentRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DepartmetServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department save(int departmentId, String departmentName) {
        Department dept = new Department();
        dept.setDepartmentName(departmentName);
        dept.setDepartmentId(departmentId);
        log.info("save, before repo, departmentId = " + dept.getDepartmentId());
        dept = departmentRepo.save(dept);
        log.info("save, after repo, departmentId = " + dept.getDepartmentId());
        return dept;
    }
}
