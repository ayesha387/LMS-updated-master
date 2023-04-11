package com.example.LMS.model;

import com.example.LMS.entity.Book;
import com.example.LMS.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
public class BookModel {
    private String name;
    private String ISBN;
    private String edition;
    private String author;
    private String shelfName;
    private Category category;

    public Book disassemble() {
        Book book =new Book();
        book.setName(name);
        book.setISBN(ISBN);
        book.setEdition(edition);
        book.setAuthor(author);
        book.setCategory(category);
        return book;
    }
    public BookModel assemble(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setName(book.getName());
        bookModel.setISBN(book.getISBN());
        bookModel.setEdition(book.getEdition());
        bookModel.setAuthor(book.getAuthor());
        bookModel.setCategory(book.getCategory());
        return bookModel;
    }
}
