package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product;

public class Products {
    private Origin origin;
    private int shellLife;  //in days in fridge
    private int amountC;    //amount of vitamin C, milligram. Содержание витамина С в 100гр продукта


    public int getAmountC() {
        return amountC;
    }

    public void setAmountC(int amountC) {
        this.amountC = amountC;
    }

    public int getShellLife() {
        return shellLife;
    }

    public void setShellLife(int shellLife) {
        this.shellLife = shellLife;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
}
