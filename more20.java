class more20
{
	public static boolean more(int n)
	{
		if (n%20==1 || n%20==2)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		boolean result;
		result=more(21);
		System.out.println(result);
		
	}
}