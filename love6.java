class love6{
	public static boolean love(int a,int b)
	{
		if (a==6 || b==6 || a+b==6 || a-b==6 || b-a==6)
		{
			return true;
		}
		else
		{


		return false;
	}

	}
	public static void main(String[] args) {
		boolean result;
		result=love(6,4);
		System.out.println(result);
		
	}
}