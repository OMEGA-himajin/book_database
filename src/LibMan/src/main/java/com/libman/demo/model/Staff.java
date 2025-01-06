package com.libman.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "staffs")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StaffId", nullable = false, unique = true)
    private Integer staffId;

    @Column(name = "UserName", nullable = false, unique = true)
    private String userName;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "FirstNameKana", nullable = false)
    private String firstNameKana;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "LastNameKana", nullable = false)
    private String lastNameKana;

    @Column(name = "IsEnable", nullable = false)
    private Boolean isEnable = true;
}
