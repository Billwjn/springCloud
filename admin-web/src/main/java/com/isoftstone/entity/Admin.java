package com.isoftstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin")
@Entity
public class Admin extends BaseEntity implements Serializable {
    @Id
    @Column(name = "admin_id")
    private String adminId;
    private String username;
    private String password;
    @OneToMany(mappedBy = "admin",targetEntity = AdminDepartment.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<AdminDepartment> adminDepartments = new ArrayList<>();
}
