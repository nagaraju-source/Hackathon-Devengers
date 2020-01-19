package com.devengers.hacknight6.spider.b2bpayments.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue
    private Long invoiceId;

    @Column(name = "GSTIN")
    private String GSTIN;

    @Column(name = "bill_Amount")
    private Double billAmount;





    }

