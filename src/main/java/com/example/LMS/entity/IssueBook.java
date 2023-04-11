package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "IssueBook")
@Data
public class IssueBook {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="issue_date")
    private java.time.LocalDateTime issueDate;
    @Column(name="return_date")
    private Date returnDate;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @OneToOne
    @JoinColumn(name = "book_shelf_id")
    private BookShelf bookShelf;
}




