class blueticket
{
	public static int blue(int a,int b , int c)
	{
		if (a+b==10 || b+c==10 || c+a==10)
		{
			return 10;
		}
		else if (a+b==10+b+c || a+b==10+a+c)
		{
			return 5;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) 
	{
		int result;
		result=blue(15,0,5);
		System.out.println(result);
	}
}