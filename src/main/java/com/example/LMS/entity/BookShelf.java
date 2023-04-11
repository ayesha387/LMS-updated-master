package com.example.LMS.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "book_shelf")
@Data
public class BookShelf {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne()
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne()
    @JoinColumn(name = "shelf_id")
    private Shelf shelf;
    @OneToOne(mappedBy = "bookShelf")
    private IssueBook issueBook;
}
