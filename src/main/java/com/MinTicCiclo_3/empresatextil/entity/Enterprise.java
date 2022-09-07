package com.MinTicCiclo_3.empresatextil.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/*@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })*/
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnterprise;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "document", unique = true)
    private String document;

    private String phone;

    private String address;

    @OneToMany(mappedBy = "enterprise")
    private List<Employee> employee;

    @OneToMany(mappedBy = "enterprise")
    private List<Transaction> transaction;

    @LastModifiedDate
    private Date updateAt = new Date();
    @CreatedDate
    private Date createdAt = new Date();


}

