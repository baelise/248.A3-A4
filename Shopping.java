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
        String largest = "";

        //Finding the largest word from the list
        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i].length() > largest.length()){
                largest = arrText[i];
            }
        }

        //Declare our grocery list and price arrays
        char [][]list = new char[arrText.length][largest.length()];
        String [] priceStr = new String[arrText.length];

        //split the string with the dollar sign
        for (int i = 0; i < arrText.length; i++) {
            arrText[i] = arrText[i].substring(0,arrText[i].indexOf('$'));
            priceStr[i] = arrText[i].substring(arrText[i].indexOf('$')+1, arrText.length);

        }

        for (int i = 0; i < priceStr.length; i++) {
            System.out.println(priceStr[i]);
        }

        //Fill in the list array
        for (int row = 0; row < arrText.length ; row++)
        {
            for (int column = 0; column < largest.length(); column++)
            {

            }
        }

        //Fill in the price array
        for (int row = 0; row < arrText.length ; row++)
        {
            for (int column = 0; column < largest.length(); column++) {
                //price[row] = Integer.parseInt(list[row][column]);

            }

        }

    }
}
