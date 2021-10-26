package com.product.repository;

import com.product.model.Product;
import com.product.service.product.IProductName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

    @Query(value = "select name from product where id = ?1", nativeQuery = true)
    IProductName getProductName(Long id);

}
