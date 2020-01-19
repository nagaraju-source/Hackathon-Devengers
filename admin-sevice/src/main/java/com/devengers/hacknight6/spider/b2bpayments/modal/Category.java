package com.devengers.hacknight6.spider.b2bpayments.modal;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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

}
