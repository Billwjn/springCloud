package com.isoftstone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admin_department")
public class AdminDepartment extends BaseEntity implements Serializable {
    @Id
    @Column(name = "admin_department_id")
    private String adminDepartmentId;
    @ManyToOne(targetEntity = Admin.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id",referencedColumnName = "admin_id")
    @ToString.Exclude
    private Admin admin = new Admin();
    @Column(name = "department_id")
    private String departmentId;
}
