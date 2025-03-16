package com.ecom.Ecomerce_BackEnd.Service;

import com.ecom.Ecomerce_BackEnd.Model.Product;
import com.ecom.Ecomerce_BackEnd.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo ProductRepo;

    public List<Product> getProducts() {
        return ProductRepo.findAll();

    }


    public Product getProduct(int id) {
        return ProductRepo.findById(id).orElse(null);
    }
}
