package com.example.projetfinal.service;

import com.example.projetfinal.model.Category;
import com.example.projetfinal.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }
    public Optional<Category> getById(Long id){
        return categoryRepository.findById(id);
    }

    public List<Category> saveAll(List<Category> toSave){
        return categoryRepository.saveAll(toSave);
    }
}
