package com.los_super_master.empresa_textil.entity;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    private long id;

    private string concept;
    private float amount;

    @ManyToONE
    private Employee employee;

    @ManyToOne
    private Enterprise enterprise;

    @CreatedDate
    private Date createdAd;
    @LastModifiedDate
    private Date updateAd;

    public Transaction (){

    }

    public Transaction(long id, string concept, float amount, Employee employee, Enterprise enterprise, Date createdAd, Date updateAd) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.employee = employee;
        this.enterprise = enterprise;
        this.createdAd = createdAd;
        this.updateAd = updateAd;
    }

    public long getId() {
        return id;
    }

    public string getConcept() {
        return concept;
    }

    public float getAmount() {
        return amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public Date getCreatedAd() {
        return createdAd;
    }

    public Date getUpdateAd() {
        return updateAd;
    }

    public void setConcept(string concept) {
        this.concept = concept;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public void setCreatedAd(Date createdAd) {
        this.createdAd = createdAd;
    }

    public void setUpdateAd(Date updateAd) {
        this.updateAd = updateAd;
    }
}
