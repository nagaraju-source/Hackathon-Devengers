package com.devengers.hacknight6.spider.b2bpayments.controller;

import com.devengers.hacknight6.spider.b2bpayments.modal.Product;
import com.devengers.hacknight6.spider.b2bpayments.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/v1/adminservice")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @GetMapping("/products")
    public List<Product> getProductList(){

        return adminService.getProductList();
    }
}
