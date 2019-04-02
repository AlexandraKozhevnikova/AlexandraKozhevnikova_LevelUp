package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Dish;


import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Origin;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Vegetables;

public class Dinner {


    public static void main(String[] args) {
        Vegetables potatos = new Vegetables();
        potatos.setName("Potato");
        potatos.setOrigin(Origin.Plant);
        potatos.setAmountC(20);
        potatos.setShellLife(90);

        Vegetables beets = new Vegetables();
        beets.setName("Beet");
        beets.setOrigin(Origin.Plant);
        beets.setAmountC(10);
        beets.setShellLife(30);

        Ingredients potato = new Ingredients();
        potato.setProduct(potatos);
        potato.setAmount(2);










        Dishes borcsh = new Dishes();








    }








}
