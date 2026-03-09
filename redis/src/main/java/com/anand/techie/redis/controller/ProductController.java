package com.anand.techie.redis.controller;

import com.anand.techie.redis.entity.Product;
import com.anand.techie.redis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public Product save(@RequestBody Product product){
        return  productRepository.save(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable  int id){
        return productRepository.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        return productRepository.deleteProductById(id);
    }

}
