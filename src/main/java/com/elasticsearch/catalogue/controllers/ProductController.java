package com.elasticsearch.catalogue.controllers;

import com.elasticsearch.catalogue.services.ProductService;
import com.elasticsearch.catalogue.services.SubscriberService;

import main.model.Product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("")
    public Iterable<Product> findAll(){
        return this.productService.findAll();
    }

    @GetMapping("{id}")
    public Product findOne(@PathVariable String id){
        return this.productService.findOne(Integer.parseInt(id));
    }

    @PostMapping("")
    public Product save(@RequestBody Product product){
        return this.productService.save(product);
    }
}
