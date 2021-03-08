package com.tsb.onlinepharmarcy.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "Pharmacy")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "location")
    private String location;
}
