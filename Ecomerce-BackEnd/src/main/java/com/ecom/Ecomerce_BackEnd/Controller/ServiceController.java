package com.ecom.Ecomerce_BackEnd.Controller;

import com.ecom.Ecomerce_BackEnd.Model.Product;
import com.ecom.Ecomerce_BackEnd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ServiceController {

    @Autowired
    private ProductService ProductService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){

        return new ResponseEntity<>(ProductService.getProducts(), HttpStatus.OK) ;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable int id){
        Product product = ProductService.getProduct(id);

        if (product != null) {
            return new ResponseEntity<>(product,HttpStatus.OK);

        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product savedProduct = null;
        try {
            savedProduct = ProductService.addProduct(product, imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId) {
        Product product = ProductService.getProductById(productId);
        if (product.getId() > 0) {
            return new ResponseEntity<>(product.getImageData(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
