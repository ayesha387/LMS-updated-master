package com.example.LMS.controller;

import com.example.LMS.entity.IssueBook;
import com.example.LMS.service.IssueBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issueBooks")
public class IssueBookController {
    @Autowired
    private IssueBookService issueBookService;
    @PostMapping("/saveIssueBook")
    public ResponseEntity<IssueBook> createIssueBook(@RequestBody IssueBook issueBook) {
        IssueBook savedIssueBook = issueBookService.save(issueBook);
        return new ResponseEntity<>(savedIssueBook, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<IssueBook> getIssueBookById(@PathVariable Long id) {
        IssueBook issueBook = issueBookService.findById(id);
        if (issueBook == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(issueBook, HttpStatus.OK);
    }
    @GetMapping("/list")
    public ResponseEntity<List<IssueBook>> getAllIssueBooks() {
        List<IssueBook> issueBooks = issueBookService.findAll();
        return new ResponseEntity<>(issueBooks, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIssueBookById(@PathVariable Long id) {
        issueBookService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
