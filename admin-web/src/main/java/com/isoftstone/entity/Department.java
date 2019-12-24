package com.isoftstone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="department")
@Entity
public class Department extends BaseEntity implements Serializable {
    @Id
    @Column(name = "department_id")
    private String departmentId;
    @Column(name="department_name")
    private String departmentName;
    @Column(name = "department_code")
    private String departmentCode;
}
