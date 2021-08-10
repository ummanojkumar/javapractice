class nearTen{
	public static boolean near(int num)
	{
		if (num%10==8 || num%10==9 || num%10==0 || num%10==1 || num%10==2)
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
		result=near(17);
		System.out.println(result);
	}
}