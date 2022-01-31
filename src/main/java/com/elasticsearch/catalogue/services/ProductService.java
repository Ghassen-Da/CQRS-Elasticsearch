package com.elasticsearch.catalogue.services;

import com.elasticsearch.catalogue.repositories.ProductRepo;

import main.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public Product save(Product product){
        return this.productRepo.save(product);
    }

    public Product findOne(int id){
        return this.productRepo.findById(id).orElse(null);
    }

    public Iterable<Product> findAll(){
        return this.productRepo.findAll();
    }
}
