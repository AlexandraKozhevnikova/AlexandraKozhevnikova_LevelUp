package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Dish;

// TODO Не используемые импорты
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Products;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Vegetables;

import java.util.Collections;
import java.util.List;


// TODO Как правило именна классов носят единственное число
public class Ingredients implements Cook{
    private Products product;
    private int amount;     // gram for one portion


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


    public static String printContents(Ingredients ingredients) {
        String a = ingredients.product.getName() + " - " + ingredients.getAmount() + " грамм";
        return a;

    }

    public void cook() {
        System.out.println("Нарезать ломтиками");
    }

    public static int caloric (Ingredients ingredients){
        int c = ingredients.amount * ingredients.product.getAmountC()/100;

        return c;

    }; // TODO А зачем тут ;????










}
