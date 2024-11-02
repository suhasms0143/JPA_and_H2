package com.telusko.simpleWebApp.controller;

//product class help to identify the product list

// you should not write any business logic in the controller

// controller is accepting the request and response

// Controller get the data from this services

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductContoller {
    @Autowired
    ProductService service;

    //@RequestMapping("/products")
    @GetMapping("/products")

    public List<Product> getproducts(){
        return service.getProducts();
    }

    // it will give by id in postman,
    // getProductById we don't have method we have to create

    //@RequestMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
// @RequestBody is request from client to server
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")

    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")

    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}



// if we have two @RequestMapping (products) is two  get confused
// use specific url like GetMapping or PostMapping
