class maxMod5{
	public static int max(int a,int b)
	{
		if (a==b)
		{
			return 0;
		}
		
		else if (a%5==b%5)
		{
			if (a<b)
		{
			return a;
		}
		else 
		{
			return b;
		}
		
		}
		if (a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String[] args) {
		int result;
		result=max(3,2);
		System.out.println(result);
		
	}
}