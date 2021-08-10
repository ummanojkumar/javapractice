/*3)Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true*/
class exam1p3
{
	public static boolean lastDigit(int a,int b,int c)
	{
		if (a%10==b%10 || a%10==c%10 || b%10==c%10)
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
		result=lastDigit(23,19,13);
		System.out.println(result);
		result=lastDigit(52,19,12);
		System.out.println(result);
		result=lastDigit(23,19,3);
		System.out.println(result);
	}
}