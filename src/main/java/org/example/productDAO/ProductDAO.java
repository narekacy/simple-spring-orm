package org.example.productDAO;

import org.example.entity.Product;

import java.util.List;

public interface ProductDAO {
    int create(Product product);
    void update(Product product);
    void delete(Product product);
    Product find(int id);
    List<Product> findAll();
}
