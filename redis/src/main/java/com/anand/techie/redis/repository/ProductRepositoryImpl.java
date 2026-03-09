package com.anand.techie.redis.repository;

import com.anand.techie.redis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private RedisTemplate<String, Product> redisTemplate;

    public static final String HASH_KEY = "Product";

    @Override
    public Product save(Product product) {
        redisTemplate.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Object> objectList = redisTemplate.opsForHash().values(HASH_KEY);
        List<Product> products = objectList.stream()
                .map(o -> (Product) o)
                .collect(Collectors.toList());
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return (Product) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    @Override
    public String deleteProductById(int id) {
        redisTemplate.opsForHash().delete(HASH_KEY, id);
        return "Product Deleted Successfully " + id;
    }
}
