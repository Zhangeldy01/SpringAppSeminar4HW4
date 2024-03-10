package com.example.SpringAppSeminar4HW4.model;

import lombok.Data;

@Data
public class Product {
    // идентификатор
    private int id;

    // модель телевизора
    private String TVModel;

    // производитель телевизора
    private String manufacturer;

    //Стоимость ТВ
    private double price;

}
