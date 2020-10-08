package com.mukundmadhav.springboot.springboot.componet.repo;

import com.mukundmadhav.springboot.springboot.componet.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    Department save(Department dept);
}
