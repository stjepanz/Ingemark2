package com.ingemark2.application.service;

import com.ingemark2.application.dto.ProductDto;

import java.util.List;

public interface ProductService {

    Object getProducts(Integer pageSize, Integer pageNumber, String search, Integer sortBy, Integer sortDirection);

    void addProducts(List<ProductDto> productDtoList);

    void updateProduct(ProductDto productDto);

    void deleteProduct(String code);
}
