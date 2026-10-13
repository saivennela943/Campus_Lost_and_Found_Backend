package com.campus.lostfound;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class ItemReport { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String type; public String itemName; public String category; @Column(length=2000) public String description; public String location; public LocalDate itemDate; public String imageUrl; public String status="OPEN"; @ManyToOne(fetch=FetchType.EAGER) public AppUser owner; public ItemReport(){} }
