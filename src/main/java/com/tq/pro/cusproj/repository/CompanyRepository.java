package com.tq.pro.cusproj.repository;

import org.springframework.stereotype.Repository;

import com.tq.pro.cusproj.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long>{
	
}
