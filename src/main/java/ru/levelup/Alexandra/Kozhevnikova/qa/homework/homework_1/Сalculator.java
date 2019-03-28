package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_1;

import java.util.Scanner;

public class Сalculator {

    public static void main(String[] args) {


        //Узнаем оператор

        Scanner in = new Scanner(System.in);
        System.out.print("Какую операцию выполнить? \n + -- сложение; \n - -- вычитание; " +
                          "\n * -- умножение; \n ^ -- возведение в степень;\n ! -- вычисление факториала. " +
                          "\n \nВведите соответсвующий символ: ");
        String operator = in.nextLine();
        System.out.println();





        //Запрашиваем нужные операнды

        if (operator.equals("+")) {
            Opepator sum = new Opepator();
            sum.nameFirstOperand = "первое слагаемое";
            sum.nameSecondOperand = "второе слагаемое";

            sum.getOperandHelper();


        } else if (operator.equals("-")){
            Opepator diff = new Opepator();
            diff.nameFirstOperand = "уменьшаемое";
            diff.nameSecondOperand = "вычитаемое";

            diff.getOperandHelper();

        } else if (operator.equals("*")){
            Opepator product = new Opepator();   /* product - произведение чисел */
            product.nameFirstOperand = "первый множитель";
            product.nameSecondOperand = "второй множитель";

            product.getOperandHelper();

        } else if (operator.equals("^")){
            Opepator deg = new Opepator();
            deg.nameFirstOperand = "основание степени";
            deg.nameSecondOperand = "показатель степени";

            deg.getOperandHelper();

        } else if (operator.equals("!")){
            System.out.print("Введите множитель факториала: ");
            double firstOperand = in.nextDouble();            //Возможно нужно поменять переменную
            System.out.println();

        } else {
            System.out.println("Введенное значение не равно ни одному из перечисленных +, -, *, ^, !. " +
                "\n Начните программу заново.");
        }






    }







    }


class Opepator {
    String nameFirstOperand;
    String nameSecondOperand;

    void getOperandHelper() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите " + nameFirstOperand + ": ");
        double firstOperand = in.nextDouble();
        System.out.println();


        System.out.print("Введите " + nameSecondOperand + ": ");
        double secondOperand = in.nextDouble();
        System.out.println();

    }
}


 //      in.close();    --так и не поняла куда ее запихнуть :(