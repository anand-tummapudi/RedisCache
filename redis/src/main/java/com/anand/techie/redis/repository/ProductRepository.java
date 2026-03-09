package com.anand.techie.redis.repository;

import com.anand.techie.redis.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    Product save(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    String deleteProductById(int id);

}
