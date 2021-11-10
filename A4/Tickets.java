public class Tickets {
    final static double regularTicketPrice = 3.50, juniorTicketPrice = 2.50, seniorTicketPrice = 1, dailyTicketPrice = 10, weeklyTicketPrice = 40;
    int regularTicketAmount, juniorTicketAmount,seniorTicketAmount,dailyTicketAmount,weeklyTicketAmount;

    //Default constructor
    public Tickets() {}

    //Constructor that allows to set the amount of tickets in a Ticket object
    public Tickets(int a, int b, int c, int d, int e)
    {
        regularTicketAmount = a;
        juniorTicketAmount = b;
        seniorTicketAmount = c;
        dailyTicketAmount = d;
        weeklyTicketAmount = e;
    }

    //Getter methods
    public int getDailyTicketAmount() {
        return dailyTicketAmount;
    }

    public int getWeeklyTicketAmount() {
        return weeklyTicketAmount;
    }

    public int getRegularTicketAmount() {
        return regularTicketAmount;
    }

    public int getJuniorTicketAmount() {
        return juniorTicketAmount;
    }

    public int getSeniorTicketAmount() {
        return seniorTicketAmount;
    }

    //Setter methods
    public void setRegularTicketAmount(int regularTicketAmount) {
        this.regularTicketAmount = regularTicketAmount;
    }

    public void setJuniorTicketAmount(int juniorTicketAmount) {
        this.juniorTicketAmount = juniorTicketAmount;
    }

    public void setSeniorTicketAmount(int seniorTicketAmount) {
        this.seniorTicketAmount = seniorTicketAmount;
    }

    public void setDailyTicketAmount(int dailyTicketAmount) {
        this.dailyTicketAmount = dailyTicketAmount;
    }

    public void setWeeklyTicketAmount(int weeklyTicketAmount) {
        this.weeklyTicketAmount = weeklyTicketAmount;
    }

    //Method allowing user to increase the amount of tickets
    public void addTickets(int a, int b, int c, int d, int e)
    {
        regularTicketAmount += a;
        juniorTicketAmount += b;
        seniorTicketAmount += c;
        dailyTicketAmount += d;
        weeklyTicketAmount += e;
    }
}