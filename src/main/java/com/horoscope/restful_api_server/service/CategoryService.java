package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.model.Category;
import com.horoscope.restful_api_server.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategory(int id) {
        return categoryRepository.findById(id).isPresent()
                ? categoryRepository.findById(id).get() : null;
    }
}
