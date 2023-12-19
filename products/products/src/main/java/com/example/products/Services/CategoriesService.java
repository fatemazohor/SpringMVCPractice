package com.example.products.Services;

import com.example.products.Model.Categories;
import com.example.products.Repository.Icategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {
    @Autowired
    private Icategories repo;

    public void saveCat(Categories categories){
        repo.save(categories);
    }

    public List<Categories> getAllCategories(){
        List<Categories> categoriesList=repo.findAll();
        return categoriesList;
    }

    public void deleteCat(int id){
        repo.deleteById(id);
    }

    public Categories findCategories(int id){
        return repo.findById(id).get();
    }

}
