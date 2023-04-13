package com.example.LMS.service;
import com.example.LMS.entity.BookShelf;
import com.example.LMS.model.BookShelfModel;
import com.example.LMS.repository.BookRepo;
import com.example.LMS.repository.BookShelfRepo;
import com.example.LMS.repository.ShelfRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
@Service
public class BookShelfService {
    @Autowired
    private BookShelfRepo bookShelfRepo;


    public BookShelfService(BookShelfRepo bookShelfRepo) {
        this.bookShelfRepo = bookShelfRepo;
    }

    public List<BookShelf> getAllBookshelves() {
        return bookShelfRepo.findAll();
    }

    public BookShelf getBookShelfById(Long id) {
        return bookShelfRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Bookshelf with id " + id + " not found"));
    }

    public BookShelf saveBookShelf(BookShelfModel bookShelfModel) {

        return (bookShelfRepo.save(bookShelfModel.disassemble()));

    }

    public void deleteBookshelfById(Long id) {
        bookShelfRepo.deleteById(id);
    }

}


