package com.example.LMS.controller;

import com.example.LMS.entity.Book;
import com.example.LMS.model.BookModel;
import com.example.LMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/save")
    public String createBook(@RequestBody BookModel bookModel) {
        return bookService.saveBook(bookModel);
    }
    @GetMapping("/list")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody BookModel bookModel) {
        Book book = bookService.getBookById(id);
        book.setISBN(bookModel.getISBN());
        book.setEdition(bookModel.getEdition());
        book.setAuthor(bookModel.getAuthor());
        return bookService.saveBook(bookModel);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
