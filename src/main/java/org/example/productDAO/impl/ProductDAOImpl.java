package org.example.productDAO.impl;

import org.example.entity.Product;
import org.example.productDAO.ProductDAO;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final HibernateTemplate hibernateTemplate;

    public ProductDAOImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int create(Product product) {
        Integer result = (Integer) hibernateTemplate.save(product);
        return result;
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product find(int id) {
        Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = hibernateTemplate.loadAll(Product.class);
        return products;
    }
}
