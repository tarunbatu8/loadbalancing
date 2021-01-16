package com.telusko.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Number, Long>{

	/**
	 * @return
	 */
	@Query(value = "select * from Number limit 1", nativeQuery = true)
	Number getNumber();
}