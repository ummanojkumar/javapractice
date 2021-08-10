/*6)Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.


inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true*/
 
class exam2_6
{
	public static boolean inOrderEqual(int a,int b,int c,boolean equalOk)
	{
		if (a<b && b<c && equalOk==false)
		{
			return true;
		}
		else if((a<b || a==b) && (b<c || b==c) && equalOk==true)
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
		result=inOrderEqual(5,5,5,false);
		System.out.println(result);
		result=inOrderEqual(5,7,6,false);
		System.out.println(result);
		result=inOrderEqual(5,5,7,true);
		System.out.println(result);
	}
}