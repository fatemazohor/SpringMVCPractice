package com.example.products.Repository;

import com.example.products.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iproducts extends JpaRepository<Products,Integer> {
}
