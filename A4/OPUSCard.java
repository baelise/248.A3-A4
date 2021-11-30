public class OPUSCard {

    // attributes
    // variables must be private
    private String cardType, cardHolder;
    private int expYear, expMonth;

    // default constructor
    public OPUSCard() {}

    // copy constructor
    public OPUSCard(OPUSCard opus) {
        this.cardHolder = opus.cardHolder;
        this.cardType = opus.cardType;
        this.expMonth = opus.expMonth;
        this.expYear = opus.expYear;
    }

    public OPUSCard(String a, String b, int c, int d)
    {
        cardType = a;
        cardHolder = b;
        expYear = c;
        if(d > 0 && d < 13)
        {
            expMonth = d;
        }
        else
        {
            expMonth = 0;
        }
    }
    // accessor methods
    public String getCardType()
    {
        return cardType;
    }

    public String getCardHolder()
    {
        return cardHolder;
    }

    public int getExpMonth()
    {
        return expMonth;
    }

    public int getExpYear()
    {
        return expYear;
    }

    // mutator methods
    public void setExpMonth(int expMonth)
    {
        if(expMonth > 0 && expMonth <13)
        {
            this.expMonth = expMonth;
        }
        else
        {
            this.expMonth = 0;
        }
    }

    public void setExpYear(int expYear)
    {
        this.expYear = expYear;
    }
    // print out
    @Override
    public String toString()
    {
        return "OPUSCard{ " +
                "cardType: " + cardType +
                " cardHolder: " + cardHolder +
                " expYear: " + expYear +
                "expMonth " + expMonth +
                "}";
    }

    @Override
    public boolean equals(Object j)
    {
        if(this == j) return true;
        if(!(j instanceof OPUSCard)) return false;

        OPUSCard opusCard = (OPUSCard) j;

        if(getCardType() != opusCard.getCardType()) return false;
        if(getCardHolder() != opusCard.getCardHolder())  return false;
        if(getExpYear() != opusCard.getExpYear())  return false;
        if(getExpMonth() != opusCard.getExpMonth()) return false;
        return true;
    }

	/*public static void main(String[] args) {
		OPUSCard one = new OPUSCard("My mom","My dad",13,6);
		OPUSCard two = new OPUSCard(one);
		System.out.print(two);
	}*/
}
