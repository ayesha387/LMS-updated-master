package com.example.LMS.model;

import com.example.LMS.entity.Category;

import lombok.Data;
@Data

public class CategoryModel {
    private Long id;
    private String name;

    public Category disassemble() {
        Category category = new Category();
        category.setId(id);
        category.setName(name);
        return category;
    }
    public CategoryModel assemble(Category category) {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());
        return categoryModel;
    }
}

