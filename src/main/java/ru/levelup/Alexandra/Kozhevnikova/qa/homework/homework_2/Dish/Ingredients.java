package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Dish;

import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Products;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Vegetables;

public class Ingredients {
    private Products product;
    private int amount;     // gram


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }





}