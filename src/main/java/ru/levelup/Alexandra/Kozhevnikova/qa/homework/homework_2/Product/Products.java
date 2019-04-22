package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product;

// TODO Как правило именна классов носят единственное число
public  abstract class Products {
    private String name;
    private Origin origin;
    private int shellLife;  //in days in fridge
    private int amountC;    //amount of vitamin C, milligram. Содержание витамина С в 100гр продукта
    private int caloric;   //в 100 г продукта

    public int getCaloric() {
        return caloric;
    }

    public void setCaloric(int caloric) {
        this.caloric = caloric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
