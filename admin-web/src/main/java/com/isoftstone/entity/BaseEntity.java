package com.isoftstone.entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Column(name = "dr")
    private String dr = "0";
    @Column(name = "create_time")
    private Date createTime = new Date();
}
