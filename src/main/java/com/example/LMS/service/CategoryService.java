package com.example.LMS.service;

import com.example.LMS.entity.Category;
import com.example.LMS.model.CategoryModel;
import com.example.LMS.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public Category saveCategory(CategoryModel categoryModel) {
        return categoryModel.assemble(categoryRepo.save(categoryModel.disassemble())).disassemble();
    }

    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }
}

