package com.ecom.Ecomerce_BackEnd.Controller;

import com.ecom.Ecomerce_BackEnd.Model.Product;
import com.ecom.Ecomerce_BackEnd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
