package com.elasticsearch.catalogue.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.elasticsearch.catalogue.repositories.ProductRepo;

import main.model.Product;




@Service
public class SubscriberService {
private final Logger logger = LoggerFactory.getLogger(SubscriberService.class);
private final ProductService productService;

public SubscriberService(ProductService productService){
    this.productService = productService;
}
    
@KafkaListener(topics = "products-topic", groupId = "archived")
public void consume(Product product){
   logger.info(String.format("$$ -> Consumed Message -> %s",product.getName()));
   this.productService.save(product);
   }
}