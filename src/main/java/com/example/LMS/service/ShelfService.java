package com.example.LMS.service;

import com.example.LMS.entity.Shelf;
import com.example.LMS.model.ShelfModel;
import com.example.LMS.repository.ShelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ShelfService {
    @Autowired
    private ShelfRepo shelfRepo;
    public List<Shelf> getAllShelves() {
        return shelfRepo.findAll();
    }
    public Shelf getShelfById(Long id) {
        Optional<Shelf> shelf = shelfRepo.findById(id);
        if(shelf.isPresent()) {
            return shelf.get();
        } else {
            throw new RuntimeException("Shelf not found with id: " + id);
        }
    }

    public Shelf saveShelf(ShelfModel shelfModel) {
        return shelfRepo.save(shelfModel.disassemble());
    }

    public void deleteShelfById(Long id) {
        shelfRepo.deleteById(id);
    }
}

