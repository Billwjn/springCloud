package com.isoftstone.repository;

import com.isoftstone.entity.AdminDepartment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AdminDepartmentRepository extends BaseRepository<AdminDepartment> {
    @Modifying
    @Query(value = "delete from admin_department where admin_id = ?1",nativeQuery = true)
    void deleteByAdminId(String adminId);
}
