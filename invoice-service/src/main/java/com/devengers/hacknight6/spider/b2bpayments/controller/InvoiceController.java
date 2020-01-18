package com.devengers.hacknight6.spider.b2bpayments.controller;

import com.devengers.hacknight6.spider.b2bpayments.modal.Invoice;

import com.devengers.hacknight6.spider.b2bpayments.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/invoice")
public class InvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    @GetMapping("/invoiceInfo")
    public List<Invoice> getInvoiceInfo(){

        return invoiceService.getInvoiceInfo();
    }
}
