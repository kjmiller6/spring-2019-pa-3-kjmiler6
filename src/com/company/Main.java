package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The driver code for the menu goes in main
        //Create keyboard object
        Scanner keyboard = new Scanner(System.in);

        String input = getMenuChoice(keyboard);
        while (!input.equals("3")) {
            switch (input) {
                case "1":
                    displayTriangle();
                    break;
                case "2":
                    displayChart();
                    break;
                default:
                    System.out.println("Please enter an actual option");


            }
            input = getMenuChoice(keyboard);
        }
    }

    public static String getMenuChoice(Scanner keyboard){

        System.out.println("Please enter your choice");
        System.out.println("#1 for triangle");
        System.out.println("#2 for chart");
        System.out.println("#3 to quit");
        return keyboard.next();
    }


    public static void displayTriangle(){
        int i, j;
        int rows = 10;

        for(i=1; i<=rows; i++)
        {

            for(j=i; j<=rows; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }


    public static void displayChart(){

        for (int i=1; i<5; i++) {
            System.out.print(i + " ");

            for (int j=0; j<10; j++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}