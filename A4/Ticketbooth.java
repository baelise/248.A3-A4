public class Ticketbooth
{
    private Tickets tickets;
    private OPUSCard[] card;

    public Ticketbooth()
    {
        tickets = new Tickets();
        card = new OPUSCard[0];
    }

    public Ticketbooth(Tickets ticket,OPUSCard[] opusCard)
    {
        tickets = new Tickets(ticket);
        card = new OPUSCard[opusCard.length];
        for(int i = 0; i < opusCard.length; i++)
        {
            card[i]= opusCard[i];
        }
    }

    //returns the amount of tickets from ticketbooth
    public int getTicAm(){
        return tickets.getRegularTicketAmount() + tickets.getJuniorTicketAmount() + tickets.getSeniorTicketAmount() +
                tickets.getWeeklyTicketAmount() + tickets.getDailyTicketAmount();
    }

    //checks the ticket amounts of 2 ticketbooth objects
    public boolean checkTicketAmount(Ticketbooth one, Ticketbooth two){
        if (one.getTicAm()==two.getTicAm())
            return true;
        else
            return false;
    }

    //Check to see if the value of the two ticketbooths are the same
    public boolean ticketEqual(Ticketbooth one, Ticketbooth two){
        if (one.totalValue() == two.totalValue())
            return true;
        else
            return false;
    }

    //Method that returns total value of tickets in Ticketbooth
    public double totalValue(){
        return tickets.ticketsTotal();
    }

    //Method that returns the amount of OpusCards
    public int totalOpus(){
        return card.length;
    }

    public OPUSCard[] addCard(){
        OPUSCard test = new OPUSCard();
        OPUSCard[] test1 = []new OPUSCard();
    }


}
