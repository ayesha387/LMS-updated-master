package com.example.LMS.controller;

import com.example.LMS.entity.Shelf;
import com.example.LMS.model.ShelfModel;
import com.example.LMS.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/shelves")
public class ShelfController {
    @Autowired
    private ShelfService shelfService;

    @PostMapping("/save")
    public Shelf saveShelf(@RequestBody ShelfModel shelfModel) {
        return shelfService.saveShelf(shelfModel);
    }
    @GetMapping("/list")
    public List<Shelf> getAllShelves() {
        return shelfService.getAllShelves();
    }
    @GetMapping("/{id}")
    public Shelf getShelfById(@PathVariable Long id) {
        return shelfService.getShelfById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteShelfById(@PathVariable Long id) {
        shelfService.deleteShelfById(id);
    }
}

