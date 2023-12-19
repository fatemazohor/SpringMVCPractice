package com.example.products.Services;

import com.example.products.Model.Products;
import com.example.products.Repository.Iproducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private Iproducts repo;

    public void saveProducts(Products products){
        repo.save(products);
    }

    public List<Products> getAllProducts(){
        List<Products> productsList = repo.findAll();
        return productsList;
    }

    public void deleteProducts(int id){
        repo.deleteById(id);
    }

    public Products findProduct(int id){
        return repo.findById(id).get();
    }

}
