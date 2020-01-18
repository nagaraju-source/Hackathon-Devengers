package com.devengers.hacknight6.spider.b2bpayments.service.impl;

import com.devengers.hacknight6.spider.b2bpayments.modal.Invoice;
import com.devengers.hacknight6.spider.b2bpayments.repository.InvoiceRepository;
import com.devengers.hacknight6.spider.b2bpayments.service.IInvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;


    @Override
    public List<Invoice> getInvoiceInfo() {
        return invoiceRepository.findAll();
    }


}
