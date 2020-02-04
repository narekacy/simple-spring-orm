package org.example.test;

import org.example.entity.Product;
import org.example.productDAO.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestProduct {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("configTestProduct.xml");
        ProductDAO productDAO = (ProductDAO) context.getBean("productDAOImpl");

//        Product product = new Product();
//        product.setId(2);
//        product.setName("Juice");
//        product.setDescription("Sandora");
//        product.setPrice(2);
//        productDAO.create(product);
//        productDAO.update(product);
//        productDAO.delete(product);

        List<Product> product = productDAO.findAll();
        System.out.println(product);
    }
}
