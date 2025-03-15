package com.ecom.Ecomerce_BackEnd.Repo;

import com.ecom.Ecomerce_BackEnd.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
