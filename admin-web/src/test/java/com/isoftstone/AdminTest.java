package com.isoftstone;

import com.isoftstone.entity.Admin;
import com.isoftstone.entity.AdminDepartment;
import com.isoftstone.entity.Department;
import com.isoftstone.repository.AdminRepository;
import com.isoftstone.repository.DepartmentRepository;
import com.isoftstone.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@SpringBootTest
public class AdminTest {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private AdminService adminService;
    @Test
    public void testAdd(){
        String adminId = UUID.randomUUID().toString();
        Admin admin = new Admin();
        admin.setAdminId(adminId);
        ArrayList<AdminDepartment> adminDepartments = new ArrayList<>();
        List<Department> departments = departmentRepository.findAll();
        for (Department department : departments) {
            AdminDepartment adminDepartment = new AdminDepartment();
            adminDepartment.setAdminDepartmentId(UUID.randomUUID().toString());
            adminDepartment.setDepartmentId(department.getDepartmentId());
            adminDepartment.setAdmin(admin);
            adminDepartments.add(adminDepartment);
        }
        admin.setUsername("bill");
        admin.setPassword("111qqq");
        admin.setAdminDepartments(adminDepartments);
        Admin save = adminRepository.save(admin);
        System.out.println(save);
    }
    @Test
    public void testFindAll(){
        List<Admin> all = adminRepository.findAll();
        for (Admin admin : all) {
            System.out.println(admin);
            for (AdminDepartment adminDepartment : admin.getAdminDepartments()) {
                System.out.println(adminDepartment);
            }
        }
    }
    @Test
    public void testFindOne(){
        Optional<Admin> optional = adminRepository.findById("e27d3d5a-9df2-41d2-9ba1-c71a00111ce5");
        Admin admin = optional.get();
        System.out.println(admin);
        for (AdminDepartment adminDepartment : admin.getAdminDepartments()) {
            System.out.println(adminDepartment);
        }
    }
    @Test
    public void testUpdate(){
        Optional<Admin> optional = adminRepository.findById("e27d3d5a-9df2-41d2-9ba1-c71a00111ce5");
        Admin admin = optional.get();

    }
    @Test
    public void testDelete(){
        String adminId = "e27d3d5a-9df2-41d2-9ba1-c71a00111ce5";
        adminService.delete(adminId);
    }
}
