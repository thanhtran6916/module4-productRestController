package com.product.service.product;

import com.product.model.Product;
import com.product.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    IProductName getProductName(Long id);
}
