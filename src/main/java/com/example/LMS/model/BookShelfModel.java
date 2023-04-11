package com.example.LMS.model;

import com.example.LMS.entity.Book;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.entity.Shelf;
import lombok.Data;

@Data
public class BookShelfModel {
    private Shelf shelf;
    private Book book;

    public BookShelf disassemble(){
        BookShelf bookshelf = new BookShelf();
        bookshelf.setBook(book);
        bookshelf.setShelf(shelf);
        return bookshelf;
    }

    public BookShelfModel assemble(BookShelf bookshelf){
        BookShelfModel bookshelfModel = new BookShelfModel();
        bookshelfModel.setBook(bookshelf.getBook());
        bookshelfModel.setShelf(bookshelf.getShelf());
        return bookshelfModel;
    }
}
