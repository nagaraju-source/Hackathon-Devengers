package com.devengers.hacknight6.spider.b2bpayments.service.impl;

import com.devengers.hacknight6.spider.b2bpayments.modal.Product;
import com.devengers.hacknight6.spider.b2bpayments.repository.ProductRepository;
import com.devengers.hacknight6.spider.b2bpayments.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}
