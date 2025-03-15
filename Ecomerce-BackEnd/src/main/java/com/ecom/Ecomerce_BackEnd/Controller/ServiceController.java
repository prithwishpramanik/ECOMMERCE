package com.ecom.Ecomerce_BackEnd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @GetMapping("/Products")
    public String greet(){
        return "All Product";
    }
}
