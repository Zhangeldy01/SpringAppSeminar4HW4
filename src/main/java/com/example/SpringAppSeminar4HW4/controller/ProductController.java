package com.example.SpringAppSeminar4HW4.controller;

import com.example.SpringAppSeminar4HW4.model.Product;
import com.example.SpringAppSeminar4HW4.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// Использование @Controller, чтобы объявить, что класс ProductController является классом управления
@Controller
@AllArgsConstructor
//@RequestMapping("/tv")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/tv")
    public String viewProduct (Model model) {
        List<Product> productsList = productService.findAllProd();
        model.addAttribute("tv", productsList);
        return "view_product";
    }

    @PostMapping("/tv")
    public String addProduct(Product product, Model model) {
        productService.addProduct(product);
        List<Product> productsList = productService.findAllProd();
        model.addAttribute("tv", productsList);
        return "view_product";
    }

}
