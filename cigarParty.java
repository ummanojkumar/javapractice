class cigarParty{
	public static boolean cp(int cigars,boolean isWeekend)
	{
		System.out.println("Inputs : "+cigars+" "+isWeekend);
		if (cigars>=40 && cigars<=60)
		{
			return true;
		}
		else if(isWeekend==true && cigars>=40)
		{
			return true;
		}
		else 
		{
			return false;
		}


      

	}
	public static void main(String[] args)
	 {
		boolean result;
		result=cp(90,false);
		System.out.println("Output : "+result);

		
	}
}