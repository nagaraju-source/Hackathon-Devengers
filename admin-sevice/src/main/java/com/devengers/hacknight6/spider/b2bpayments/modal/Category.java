package com.devengers.hacknight6.spider.b2bpayments.modal;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_Id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @JsonBackReference
    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    private List<Product> productList;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
