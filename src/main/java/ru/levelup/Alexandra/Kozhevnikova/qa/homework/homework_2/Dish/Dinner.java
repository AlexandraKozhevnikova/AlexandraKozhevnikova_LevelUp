package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Dish;


import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Meets;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Origin;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_2.Product.Vegetables;

import java.util.*;

public class Dinner {


    public static void main(String[] args) {
        Vegetables potatos = new Vegetables();
        potatos.setName("Картофель");
        potatos.setOrigin(Origin.Plant);
        potatos.setAmountC(20);
        potatos.setShellLife(90);
        potatos.setCaloric(76);

        Vegetables beets = new Vegetables();
        beets.setName("Свекла");
        beets.setOrigin(Origin.Plant);
        beets.setAmountC(10);
        beets.setShellLife(30);
        beets.setCaloric(43);

        Vegetables cabbages = new Vegetables();
        cabbages.setName("Капуста");
        cabbages.setOrigin(Origin.Plant);
        cabbages.setAmountC(45);
        cabbages.setShellLife(20);
        cabbages.setCaloric(27);

        Meets beef = new Meets();
        beef.setName("Говядина");
        beef.setAmountC(0);
        beef.setOrigin(Origin.Animal);
        beef.setShellLife(4);
        beef.setCaloric(187);

        Ingredients potato = new Ingredients();
        potato.setProduct(potatos);
        potato.setAmount(120);

        Ingredients beet = new Ingredients();
        beet.setProduct(beets);
        beet.setAmount(160);

        Ingredients meet = new Ingredients();
        meet.setProduct(beef);
        meet.setAmount(150);

        Ingredients cabbage = new Ingredients();
        cabbage.setProduct(cabbages);
        cabbage.setAmount(60);




       List<Ingredients> borcsh = new ArrayList<Ingredients>();

        borcsh.add(potato);
        borcsh.add(beet);
        borcsh.add(meet);
        borcsh.add(cabbage);


        System.out.println("Соcтав борща: ");
        for (int i = 0; i < borcsh.size(); i++)
        System.out.println(Ingredients.printContents(borcsh.get(i)));
        System.out.println();

        System.out.println("Калорийность борща: ");
        int caloricDish = 0;
        for (int i = 0; i < borcsh.size(); i++)
        caloricDish = caloricDish + Ingredients.caloric(borcsh.get(i));

        System.out.println(caloricDish);
        System.out.println();


        Collections.sort(borcsh, new Comparator<Ingredients>() {
            public int compare(Ingredients o1, Ingredients o2) {
                return 0;
            }
        });



    }








}


