import java.util.Scanner;

public class driver {

    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("==============================================");
        System.out.println("\n   	Welcome to the Ticketbooth!");
        System.out.println("\n==============================================");
        System.out.println("----------------------------------------------");

        //2 Ticketbooths with same ticket distribution and same number of Opus cards
        Tickets t1 = new Tickets(4,3,2,1,0); //33.5$
        Tickets t2 = new Tickets(4,3,2,1,0);
        OPUSCard o1 = new OPUSCard("STM", "Jeff", 2023, 10);
        OPUSCard o2 = new OPUSCard("STM", "Karen", 2022, 11);
        OPUSCard[] arr = {o1,o2};
        OPUSCard[] arr2 = {o2,o1};
        Ticketbooth tb1 = new Ticketbooth(t1, arr);
        Ticketbooth tb2 = new Ticketbooth(t2, arr2);

        //1 ticketbooth with same total value of tickets of another ticketbooth but with diff
        //configuration of tickets and this ticketbooth should have at least 3 OPUD cards
        Tickets t3 = new Tickets(1,4,0,2,0); // 33.5 $, t3 = t1 (value)
        OPUSCard o3 = new OPUSCard("STM", "Jeff", 2023, 10);
        OPUSCard o4 = new OPUSCard("TMS", "PaPI chulo", 2023, 10);
        OPUSCard o5 = new OPUSCard("MTS", "Elise", 2023, 10);
        OPUSCard o6 = new OPUSCard("MTS", "Elise", 2023, 10);
        OPUSCard[] arr3 = {o3,o4,o5,o6};
        Ticketbooth tb3 = new Ticketbooth(t3, arr3);

        //At least 2 Ticketbooths that have the same breakdown of tickets but
        //different from the other 3 Ticketbooths and both have no OPUS cards
        Tickets t4 = new Tickets(0,0,40,0,0);
        Tickets t5 = new Tickets(0, 0, 40, 0, 0);
        OPUSCard[] arr4 = {};
        Ticketbooth tb4 = new Ticketbooth(t4, arr4);
        Ticketbooth tb5 = new Ticketbooth(t5, arr4);


        System.out.println("What would you like to do?");
        System.out.println("1. See the content of all Ticketbooth");
        System.out.println("2. See the content of t1 Ticketbooth");
        System.out.println("3. List Ticketbooths with same amount of tickets' values");
        System.out.println("4. List Ticketbooths with same Tickets amount");
        System.out.println("5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
        System.out.println("6. Add an OPUS card to an existing Ticketbooth");
        System.out.println("7. Remove an existing OPUS card from a Ticketbooth");
        System.out.println("8 Update the expiry date of an existing OPUS card");
        System.out.println("9. Add Tickets to a Ticketbooth");
        System.out.println("0. Quit");
        System.out.println("Please enter your choice and press <ENTER>: ");

        int choice = var.nextInt();

        switch (choice){
            case 1:
                System.out.println(tb1);
                System.out.println(tb2);
                System.out.println(tb3);
                System.out.println(tb4);
                System.out.println(tb5);
                break;

            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }

    }
}

