/*Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true

*/
class exam1p10{
	public static boolean in1To10(int n,boolean outSideMode)
	{
		if(outSideMode==false && n>=1 && n<=10)
		{
			return true;
		}
		else if (outSideMode==true && (n<=1 || n>=10))
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args)
	 {
		boolean result;
		result=in1To10(5,false);
		System.out.println(result);
		result=in1To10(11,false);
		System.out.println(result);
		result=in1To10(11,true);
		System.out.println(result);
	}
}