package com.isoftstone.repository;

import com.isoftstone.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepository extends BaseRepository<Admin>{

}
