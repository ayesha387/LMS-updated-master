package com.example.LMS.model;

import com.example.LMS.entity.BookShelf;
import com.example.LMS.entity.IssueBook;
import com.example.LMS.entity.Member;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Data
public class IssueBookModel {
    private java.time.LocalDateTime issueDate;
    private Date returnDate;
    private Member member;
    private BookShelf bookShelf;
     public IssueBook disassemble(){
         IssueBook issueBook=new IssueBook();
         issueBook.setIssueDate(LocalDateTime.parse(LocalDateTime.now().toString()));
         issueBook.setReturnDate(returnDate);
         issueBook.setMember(member);
         issueBook.setBookShelf(bookShelf);
         return issueBook;
     }
    public IssueBookModel assemble(IssueBook issueBook){
         IssueBookModel issueBookModel=new IssueBookModel();
         issueBook.setIssueDate(issueBook.getIssueDate());
         issueBookModel.setReturnDate(issueBook.getReturnDate());
         issueBookModel.setMember(issueBook.getMember());
         issueBookModel.setBookShelf(issueBook.getBookShelf());
         return  issueBookModel;
    }
}
