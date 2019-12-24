package com.isoftstone.service;

import com.isoftstone.entity.Admin;
import com.isoftstone.repository.AdminDepartmentRepository;
import com.isoftstone.repository.AdminRepository;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Slf4j
@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private AdminDepartmentRepository adminDepartmentRepository;
    @Transactional
    public void update(Admin admin){

    }
    @Transactional
    public void delete(String adminId){
        adminRepository.deleteById(adminId);
        adminDepartmentRepository.deleteByAdminId(adminId);
    }

}
