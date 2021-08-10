class twoAsOne{
	public static boolean two(int a,int b,int c)
	{
		if (a+b==c || a+c==b || b+c==a)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		boolean result;
		result=two(3,2,2);
		System.out.println(result);
		
	}
}