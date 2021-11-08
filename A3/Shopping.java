// -------------------------------------------------------
// Assignment 3
// Written by: Andrei Barbulescu
// For COMP 248 Section P – Fall 2021
// --------------------------------------------------------

import java.util.Scanner;

public class Shopping {

    /* COPY & PASTE
        banana$1,tomato$5,apple$3
    */
    public static void main(String[] args) {

        //Welcome message
        System.out.println("-------****-------****-------****-------****-----");
        System.out.println("      Welcome to Shopping List Program!");
        System.out.println("-------****-------****-------****-------****-----");
        System.out.println("Please enter your shopping list (item$price and separated by a comma)");

        //Initializing variables
        String text = new String();
        Scanner var = new Scanner(System.in);
        text = var.nextLine();
        int total = 0;

        //Splitting the string whenever we see the ',' so that we know the array size required
        String [] arrText= text.split(",");

        //Declare our grocery list and price arrays
        char [][]list = new char[arrText.length][];
        int [] price = new int[arrText.length];
        int index = 0;

        //fill in the character and price array with user data
        for (String product : arrText) {
            price[index] = Integer.parseInt(product.substring(product.lastIndexOf("$") + 1));
            list[index] = product.substring(0, product.lastIndexOf("$")).toCharArray();
            index++;
        }

        //If user enters nothing
        if (text.equals("0")){
            System.out.println("You have 0 items in the list now!");
            System.out.println("Thank you for using this program!!");
        }
        
        //If the user enters a grocery list
        else {
            System.out.println("Here are the list of items: ");
            System.out.println();

            //Printing out the food contents
            for (int i = 0; i < arrText.length ; i++) {
                System.out.print("No." + (i+1) + " ");
                System.out.print(list[i]);
                System.out.println();
                total += price[i];
            }
            //Printing out the closing statement
            System.out.println("The total price is : $" + total + ".");
            System.out.println();
            System.out.println("Thank you for using this program!");
        }
    }
}
