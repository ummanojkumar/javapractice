/*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true */
class exam1p9
{
	public static boolean lessBy10(int a,int b, int c)
	{
		if (a-b>=10 || a-c>=10 || b-c>=10 || b-a>=10 || c-a>=10 || c-b>=10)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) 
	{
		boolean result;
		result=lessBy10(1,7,11);
		System.out.println(result);
		result=lessBy10(1,7,10);
		System.out.println(result);
		result=lessBy10(11,1,7);
		System.out.println(result);
		
	}
}