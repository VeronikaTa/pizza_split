package com.epam.training.student_veronika_tarasova.pizza_split.src.main.java.com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int numberPeople;
        int numberPieces;
        int numberPizzas = 1;
        boolean numberFound = false;

        numberPeople = scanner.nextInt();
        numberPieces = scanner.nextInt();

        while(!numberFound){

            if((numberPizzas * numberPieces) % numberPeople == 0){
                numberFound = true;
            }
            else{
                numberPizzas ++;
            }
        }

        System.out.println(numberPizzas);

    }
}
