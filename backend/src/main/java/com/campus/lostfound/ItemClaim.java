package com.campus.lostfound;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity public class ItemClaim { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @ManyToOne(fetch=FetchType.EAGER) public ItemReport item; @ManyToOne(fetch=FetchType.EAGER) public AppUser claimant; @Column(length=1500) public String message; public String status="PENDING"; public LocalDateTime createdAt=LocalDateTime.now(); public ItemClaim(){} }
