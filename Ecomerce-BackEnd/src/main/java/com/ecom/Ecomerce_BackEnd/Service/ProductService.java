package com.ecom.Ecomerce_BackEnd.Service;

import com.ecom.Ecomerce_BackEnd.Model.Product;
import com.ecom.Ecomerce_BackEnd.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    public Product addProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return ProductRepo.save(product);
    }

    public Product getProductById(int productId) {
        return ProductRepo.findById(productId).orElse(null);

    }
    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return ProductRepo.save(product);
    }


    public void deleteProduct(int id) {
        ProductRepo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return ProductRepo.searchProducts(keyword);

    }
}
