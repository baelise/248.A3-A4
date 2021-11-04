import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        //Creating our variables needed for the program
        Scanner var = new Scanner(System.in);
        int year;
        System.out.println("-------****-------****-------****-------****-----");
        System.out.println("        Welcome to Calendar Program!");
        System.out.println("-------****-------****-------****-------****-----");
        String[] months = {null, "January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String word = "common";

        //Size of our month array
        final int MONTH_INDEX = 13;

        //Loop that verifies that the user enters a 4 digit number
        do
        {
            System.out.println("Please enter a 4-digit year:");
            year = var.nextInt();
        } while (year < 1000 || year > 9999);

        //Boolean statement that determines if it is a leap year
        boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        //Adjusting the number of days in the month of February depending on if it is a leap year
        if (leapYear)
        {
            days[2]++;
            word = "leap";
        }

        //For loop to print out the dates that are not multiples of the month number
        for (int i = 1; i < MONTH_INDEX; i++)
        {
            String text = "";
            int count = 0;
            for (int j = 1; j <= days[i]; j++)
            {
                if (j % i != 0)
                {
                    count++;
                    text += j + ", ";
                }

                //Prints a new line after printing 15 dates
                if (count == 15){
                    text += "\n";
                    count = 0;
                }

            }

            //If the month is february, then we specify if the year is leap or not
            if (i == 2)
                System.out.println("In " + months[2] + " in a " + word + " year, the dates that are not multiples of " + i + " are:");
            else
                System.out.println("In " + months[i] + ", the dates that are not multiples of " + i + " are:");

            //if the month is January, automatically we know that all the possible dates are multiples of 1
            if (i == 1)
                System.out.println("No dates are found for this month!");
            else
                System.out.println(text);

            System.out.println();
        }

        //Exit message
        System.out.println("Thank you for using this program!");
        }
    }


