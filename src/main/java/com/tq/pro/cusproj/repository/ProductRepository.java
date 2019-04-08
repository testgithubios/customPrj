package com.tq.pro.cusproj.repository;

import org.springframework.stereotype.Repository;

import com.tq.pro.cusproj.entity.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products,Long> {

}
