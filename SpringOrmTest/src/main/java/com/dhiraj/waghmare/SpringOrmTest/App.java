package com.dhiraj.waghmare.SpringOrmTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/dhiraj/waghmare/SpringOrmTest/config.xml");

        ProductDao productDao = (ProductDao) context.getBean("productDao");

        Product product = new Product();
        product.setId(3);
        product.setName("Iconic");
        product.setDesc("Its Awesome!!");
        product.setPrice(150000);

        //productDao.create(product);
        //productDao.delete(product);
        productDao.update(product);



        List<Product> products = productDao.findAll();

        System.out.println(products);
    }
}