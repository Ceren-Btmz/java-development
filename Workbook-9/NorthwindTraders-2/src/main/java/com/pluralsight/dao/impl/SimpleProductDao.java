package com.pluralsight.dao.impl;

import com.pluralsight.models.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao {
    private List<Product> employees;

    public SimpleProductDao() {
        this.products = new ArrayList<>();

    }


}
