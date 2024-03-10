package com.example.SpringAppSeminar4HW4.service;

import com.example.SpringAppSeminar4HW4.model.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class ProductService {
    /**
     * Создание списка продуктов
     */
    private List<Product> productsList = new ArrayList<>();

    /**
     * метод добавления продукта
     * @param product
     */
    public void addProduct(Product product) {
        productsList.add(product);
    }

    /**
     * метод получения всех продуктов
     */
    public List<Product> findAllProd() {
        return productsList;
    }
}
