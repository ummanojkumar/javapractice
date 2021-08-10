/*1)When squirrels get together for a party,
 they like to have cigars. A squirrel party is successful 
 when the number of cigars is between 40 and 60, inclusive. 
 Unless it is the weekend, in which case there is no upper bound on
  the number of cigars. Return true if the party with the given values is successful,
  or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true */
class exam1
{
	public static boolean cigarParty(int cigars,boolean isWeekend)
	{
		if (isWeekend==false && cigars>=40 && cigars<=60)
		{
			return true;
		}
		else if(isWeekend==true && cigars>=40)
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
		result=cigarParty(30,false);
		System.out.println(result);
		result=cigarParty(50,false);
		System.out.println(result);
		result=cigarParty(70,true);
		System.out.println(result);

	}
}