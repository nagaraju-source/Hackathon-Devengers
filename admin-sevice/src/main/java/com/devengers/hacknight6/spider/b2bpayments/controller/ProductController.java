package com.devengers.hacknight6.spider.b2bpayments.controller;

import com.devengers.hacknight6.spider.b2bpayments.modal.Product;
import com.devengers.hacknight6.spider.b2bpayments.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/v1/productservice")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> getProductList(){

        return productService.getProductList();
    }
}
