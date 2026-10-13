package com.campus.lostfound;
import jakarta.persistence.*;
@Entity @Table(name="app_users") public class AppUser { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @Column(nullable=false) public String name; @Column(nullable=false,unique=true) public String email; @Column(nullable=false) public String passwordHash; public AppUser(){} public AppUser(String n,String e,String p){name=n;email=e;passwordHash=p;} }
