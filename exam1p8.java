/* 8)The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true */
class exam1p8
{
	public static boolean love6(int a,int b)
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
		result=love6(6,4);
		System.out.println(result);
		result=love6(4,5);
		System.out.println(result);
		result=love6(17,8);
		System.out.println(result);
		
	}
}