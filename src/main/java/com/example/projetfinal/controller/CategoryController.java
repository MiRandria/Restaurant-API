package com.example.projetfinal.controller;

import com.example.projetfinal.model.Category;
import com.example.projetfinal.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
@CrossOrigin
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.findAllCategory();
    }

    @PostMapping("")
    public List<Category> saveAllCategory(@RequestBody List<Category> categories){
        return  categoryService.saveAll(categories);
    }
}
