//package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_1;
//
//import java.util.Scanner;
//
///** TODO
// *      1. В пункте 5 домашнего задания описаны требовнния как должен вызываться код
// *      2. Отсутсвует класс операции сложения
// *      3. Отсутсвует класс операции вычитания
// *      4. Отсутсвует класс операции умножения
// *      5. Отсутсвует класс операции возведения в степень
// *      6. Отсутсвует класс операции факториал
// *      7. Не перегрузок операций
// */
//public class Сalculator {
//
//    public Double qwe = 0.00;
//
//    public static void main(String[] args) {
//
//        double answer;
//
//        //Узнаем оператор
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Какую операцию выполнить? \n + -- сложение; \n - -- вычитание; " +
//                          "\n * -- умножение; \n ^ -- возведение в степень;\n ! -- вычисление факториала. " +
//                          "\n \nВведите соответсвующий символ: ");
//        String operator = in.nextLine();
//        System.out.println();
//
//
//
//
//
//
//        //Запрашиваем нужные операнды
//
//        if (operator.equals("+")) {
//            Opepator sum = new Opepator();
//            sum.nameFirstOperand = "первое слагаемое";
//            sum.nameSecondOperand = "второе слагаемое";
//
//            sum.getOperandHelper();
//
//            answer = sum.firstOperand + sum.secondOperand;
//            System.out.println(sum.firstOperand + " + " + sum.secondOperand + " = " + answer);
//
//
//
//        } else if (operator.equals("-")){
//            Opepator diff = new Opepator();
//            diff.nameFirstOperand = "уменьшаемое";
//            diff.nameSecondOperand = "вычитаемое";
//
//            diff.getOperandHelper();
//
//            answer = diff.firstOperand - diff.secondOperand;
//            System.out.println(diff.firstOperand + " - " + diff.secondOperand + " = " + answer);
//
//
//
//        } else if (operator.equals("*")){
//            Opepator product = new Opepator();   /* product - произведение чисел */
//            product.nameFirstOperand = "первый множитель";
//            product.nameSecondOperand = "второй множитель";
//
//            product.getOperandHelper();
//
//            answer = product.firstOperand * product.secondOperand;
//            System.out.println(product.firstOperand + " * " + product.secondOperand + " = " + answer);
//
//        } else if (operator.equals("^")){
//            Opepator deg = new Opepator();
//            deg.nameFirstOperand = "основание степени";
//            deg.nameSecondOperand = "показатель степени";
//
//            deg.getOperandHelper();
//            System.out.println(deg.firstOperand + " ^ " + deg.secondOperand + " = (не успела разобраться как считать)");
//
//
//        } else if (operator.equals("!")){
//            System.out.print("Введите множитель факториала: ");
//            double firstOperand = in.nextDouble();            //Возможно нужно поменять переменную
//            System.out.println();
//            System.out.println("!" + firstOperand +  " = (не успела разобраться как считать)");
//
//
//        } else {
//            System.out.println("Введенное значение не равно ни одному из перечисленных +, -, *, ^, !. " +
//                "\nНачните программу заново.");
//        }
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//    }
//
//
//  class Opepator {
//    String nameFirstOperand;
//    String nameSecondOperand;
//    double firstOperand;
//    double secondOperand;
//
//     void getOperandHelper() {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите " + nameFirstOperand + ": ");
//        firstOperand = in.nextDouble();
//        System.out.println();
//
//
//        System.out.print("Введите " + nameSecondOperand + ": ");
//        secondOperand = in.nextDouble();
//        System.out.println();
//
//
//    }
//
//
//
//
//
//
//}
//
//
// //      in.close();    --так и не поняла куда ее запихнуть :(
//
