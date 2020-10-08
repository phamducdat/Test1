package com.mukundmadhav.springboot.springboot.componet.service;

import com.mukundmadhav.springboot.springboot.componet.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department save(int departmentId, String departmentName);
}
