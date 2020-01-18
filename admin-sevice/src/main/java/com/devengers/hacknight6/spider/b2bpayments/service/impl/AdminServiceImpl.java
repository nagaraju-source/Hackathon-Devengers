package com.devengers.hacknight6.spider.b2bpayments.service.impl;

import com.devengers.hacknight6.spider.b2bpayments.modal.Product;
import com.devengers.hacknight6.spider.b2bpayments.repository.AdminRepository;
import com.devengers.hacknight6.spider.b2bpayments.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Product> getProductList() {
        return adminRepository.findAll();
    }
}
