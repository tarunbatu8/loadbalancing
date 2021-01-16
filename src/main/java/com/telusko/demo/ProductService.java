package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class ProductService {
 
    /**
     * 
     */
    @Autowired
    private ProductRepository repo;
     
    /**
     * @param num
     * @return
     */
    public boolean updateData( Number num ) {
        repo.saveAndFlush(num);
        return true;
    }
    
    /**
     * @return
     */
    public Number get() {
    	return repo.getNumber();
    }
}