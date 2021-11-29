public class OPUSCard {
	
	//attributes
	String cardType, cardHolder;
	int expYear, expMonth;
	
	// default constructor
	public OPUSCard() {}
	
	// copy constructor
	public OPUSCard(OPUSCard opus) {}
	
	public OPUSCard(String a, String b, int c, int d)
	{
		cardType = a;
		cardHolder = b;
		expYear = c;
		if(c > 0 && c < 13)
		{
			expMonth = d;
		}
		else
		{
			expMonth = 0;
		}
	}
	//accessor methods 
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
	
	//mutator methods ????
	public int setExpMonth(int expMonth)
	{
		if(expMonth > 0 && expMonth <13)
		{
			return expMonth;
		}
		else
		{
			return 0;
		}
	}
	
	public void setExpYear(int expYear)
	{
		this.expYear = expYear;
	}
	//print out
	@Override
	public String toString()
	{
		return "OPUSCard{" + 
				"cardType: " + cardType +
				"cardHolder: " + cardHolder +
				"expYear: " + expYear +
				"expMonth" + expMonth + 
				"}";
		
	}
	
	//comparing objects, NOT DONE
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
	} 
	

}
