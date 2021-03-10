package com.pradeep.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
