package com.example.LMS.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
@Entity
@Table(name = "member")
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_no")
    private Long phoneNo;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "join_Date")
    private java.time.LocalDateTime joinDate;
    @OneToMany(mappedBy = "member")
    private List<IssueBook> issueBookList;
}
