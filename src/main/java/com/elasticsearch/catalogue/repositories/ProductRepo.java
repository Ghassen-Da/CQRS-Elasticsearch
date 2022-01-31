package com.elasticsearch.catalogue.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import main.model.Product;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
}
