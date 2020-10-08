package com.mukundmadhav.springboot.springboot.componet.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table (name = "department")
public class Department {
    @Id
    @Column (name = "department_id")
    private Integer departmentId;

    @Column (name = "department_name")
    private String departmentName;
}
