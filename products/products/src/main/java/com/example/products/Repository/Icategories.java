package com.example.products.Repository;

import com.example.products.Model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Icategories extends JpaRepository<Categories,Integer> {
}
