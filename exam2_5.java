/*5) Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false*/


class exam2_5
{
	public static boolean less20(int num)
	{
		if (num%20==19 || num%20==18)
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
		result=less20(18);
		System.out.println(result);
		result=less20(19);
		System.out.println(result);
		result=less20(20);
		System.out.println(result);
	}
}