package com.example.LMS.controller;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.model.BookShelfModel;
import com.example.LMS.service.BookShelfService;
import com.example.LMS.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookshelves")
public class BookShelfController {
    @Autowired
    private BookShelfService bookshelfService;

    @PostMapping("/save")
    public BookShelf saveBookshelf(@RequestBody BookShelfModel bookShelfModel) {
        return bookshelfService.saveBookShelf(bookShelfModel);
    }

    @GetMapping("/list")
    public List<BookShelf> getAllBookshelves() {
        return bookshelfService.getAllBookshelves();
    }

    @GetMapping("/{id}")
    public BookShelf getBookshelfById(@PathVariable Long id) {
        return bookshelfService.getBookShelfById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBookshelfById(@PathVariable Long id) {
        bookshelfService.deleteBookshelfById(id);
    }

}
