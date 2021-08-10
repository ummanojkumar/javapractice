class caughtSpeeding
{
	public static int cs(int speed, boolean isBirthday)
	{
		int noticket=0;
		int smallticket=1;
		int bigticket=2;
		if (speed<=60 && isBirthday==false)
		{
			return noticket;
		}
		else if (speed>=61 &&  speed<=80 && isBirthday==false)
		{
			return smallticket;
		}
		else if (speed>=81 && isBirthday==false)
		{
			return bigticket;
		}
		
		else if (speed<=65 && isBirthday==true)
		{
			return noticket;
		}
		else if (speed>=66 &&  speed<=85 && isBirthday==true)
		{
			return smallticket;
		}
		else if (speed>=81 && isBirthday==true)
		{
			return bigticket;
		}
		return noticket;

	}
	public static void main(String[] args) {
		
		int result=cs(65,false);
		System.out.println(result);
		
	}
}