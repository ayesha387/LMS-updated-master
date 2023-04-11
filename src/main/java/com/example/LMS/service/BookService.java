package com.example.LMS.service;
import com.example.LMS.entity.Book;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.entity.Shelf;
import com.example.LMS.model.BookModel;
import com.example.LMS.repository.BookRepo;
import com.example.LMS.repository.BookShelfRepo;
import com.example.LMS.repository.ShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepo bookRepo;
    private final BookShelfRepo bookShelfRepo;
    private final ShelfRepo shelfRepo;
    @Autowired
    public BookService(BookRepo bookRepo, BookShelfRepo bookShelfRepo, ShelfRepo shelfRepo) {
        this.bookRepo = bookRepo;
        this.bookShelfRepo = bookShelfRepo;
        this.shelfRepo = shelfRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public String saveBook(BookModel bookModel) {
        String selfName=bookModel.getShelfName();
        Book book;
        new Book();
        book=bookModel.disassemble();
        bookRepo.save(book);
        Shelf shelf=new Shelf();
        shelf.setName(selfName);
        shelfRepo.save(shelf);
        BookShelf bookShelf=new BookShelf();
        bookShelf.setBook(book);
        bookShelf.setShelf(shelf);
        bookShelfRepo.save(bookShelf);
        return "Book Save Successfully" ;
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
