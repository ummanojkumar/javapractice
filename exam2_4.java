/*4)Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true*/
class exam2_4
{
	public static boolean more20(int num)
	{
		if (num%20==1 || num%20==2)
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
	 	result=more20(20);
	 	System.out.println(result);
	 	result=more20(21);
	 	System.out.println(result);
	 	result=more20(22);
	 	System.out.println(result);
		
	}
}