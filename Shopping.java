import java.util.Scanner;

public class Shopping {

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

        //Splitting the string whenever we see the ',' so that we know the array size required
        String [] arrText= text.split(",");
        String largest ="";

        //Finding the largest word from the list
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i].length() > largest.length()){
                largest = arrText[i];
            }
        }


        //Declare our grocery list and price arrays
        char [][]list = new char[arrText.length][largest.length()];
        int [] price = new int[arrText.length];

        //Fill in the list array
        for (int row = 0; row < arrText.length ; row++)
        {
            for (int column = 0; column < largest.length(); column++)
            {
               // list[row][column] = String.valueOf(arrText[column].charAt(column));
            }
        }

        //Fill in the price array
        for (int row = 0; row < arrText.length ; row++)
        {
            for (int column = 0; column < largest.length(); column++) {
                price[row] = Integer.parseInt(list[row][column]);

            }

        }
        System.out.println(list);



    }
}
