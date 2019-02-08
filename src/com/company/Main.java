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

    /**
     * This method is used to display the menu options
     * The user can then make a pick.  That choice is returned to the main method
     * @param keyboard
     * @return the menu choice
     */
    public static String getMenuChoice(Scanner keyboard){

        System.out.println("Please enter your choice");
        return keyboard.next();
    }

    /**
     * This method is used to disply the triangle when called from the main menu
     */
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

    /**
     * This method is used to display the table of numbers when called from the main menu
     * Use the tab escape sequence to get output to line up i.e. ("\t")
     */
    public static void displayChart(){

        for (int i=1; i<5; i++) {
            System.out.print(i + " ");

            for (int j=0; j<10; j++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        } // test
    }
}