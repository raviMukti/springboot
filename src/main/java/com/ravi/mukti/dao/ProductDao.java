package com.ravi.mukti.dao;

import com.ravi.mukti.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {

}
