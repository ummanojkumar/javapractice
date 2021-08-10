class in1To10
{	public static boolean in(int n, boolean outsideMode)
	{
		if (n>=1 && n<=10 && outsideMode==false)
		{
			return true;
		}
		else if (outsideMode==true && (n<=1 || n>=10))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		boolean result;
		result=in(9,true);
		System.out.println(result);
	}
}