package com.ravi.mukti.controller;

import com.ravi.mukti.dao.ProductDao;
import com.ravi.mukti.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/product")
public class ProductApiController {
    @Autowired private ProductDao productDao;

    @GetMapping("/")
    public Page<Product> findProducts(Pageable page){
        return productDao.findAll(page);
    }
}
