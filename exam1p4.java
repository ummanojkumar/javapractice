/* 4)We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false */
class exam1p4
{
	public static boolean specialEleven(int num)
	{
		if (num%11==0 || num%11==1)
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
		result=specialEleven(22);
		System.out.println(result);
		result=specialEleven(23);
		System.out.println(result);
		result=specialEleven(24);
		System.out.println(result);
		
	}
}