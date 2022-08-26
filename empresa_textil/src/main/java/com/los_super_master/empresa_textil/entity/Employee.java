package com.los_super_master.empresa_textil.entity;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.*;
import java.util.Date;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email", unique = true)
    private String email;

    @ManyToOne
    private Enterprise enterprise;

    @Enumerate (EnumType.STRING)
    private Enum_RolName enum_rolName;

    @LastModifiedDate
    private Date updateAt;
    @CreatedDate
    private Date createdAt;

    public Employee(){

    }

    public Employee(long id, String email, Enterprise enterprise, Enum_RolName enum_rolName, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprise = enterprise;
        this.enum_rolName = enum_rolName;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public Enum_RolName getEnum_rolName() {
        return enum_rolName;
    }

    public void setEnum_rolName(Enum_RolName enum_rolName) {
        this.enum_rolName = enum_rolName;
    }
}
