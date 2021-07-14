package com.example.demofinal1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PERSON")
public class PersonEntity extends AbstractEntity {

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "NAME")
    private String name;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;
}