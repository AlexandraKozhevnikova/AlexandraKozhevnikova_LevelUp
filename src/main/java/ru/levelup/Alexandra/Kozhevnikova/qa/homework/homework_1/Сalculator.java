package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_1;

//import java.util.Scanner;

import java.util.Scanner;


public class Сalculator {

    public static void main(String[] args) {
   //     Calculator app = new Calculator();
   //     app.startCalculator();


        //Узнаем оператор

        Scanner in = new Scanner(System.in);
        System.out.print("Какую операцию выполнить? \n + -- сложение; \n - -- вычитание; " +
                          "\n * -- умножение; \n ^ -- возведение в степень;\n ! -- вычисление факториала. " +
                          "\n Введите соответсвующий символ: ");
        String  operator = in.nextLine();

        System.out.println("Вы выбрали " + operator);
        in.close();


        //Запрашиваем нужные операнды

        if (operator.equals("+")) {

        } else if (operator.equals("-")){
            System.out.println("tfkj");

        } else if (ooperator.equals("*")){

        } else if (operator.equals("^")){

        } else if (operator.equals("!")){

        } else {
            System.out.println("Введенное значение не равно ни одному из перечисленных +, -, *, ^, !. " +
                "\n Начните программу заново.");
        }
    }







   // public void startCalculator() {
//далее выполняется приложение
   // }




    }
