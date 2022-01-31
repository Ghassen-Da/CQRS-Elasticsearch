package com.elasticsearch.catalogue.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(indexName = "products")
public class Product {
    @Id
    @Field(type = FieldType.Keyword)
    private String id;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Double)
    private double price;
    @Field(type = FieldType.Text)
    private String category;
    @Field(type = FieldType.Text)
    private String description;
    @Field(type = FieldType.Text)
    private String image;
}
