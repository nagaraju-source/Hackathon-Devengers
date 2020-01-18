package com.devengers.hacknight6.spider.b2bpayments.repository;


import com.devengers.hacknight6.spider.b2bpayments.modal.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long>
{

}
