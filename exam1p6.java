/*6)Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false */
class exam1p6
{
	public static boolean answerCell(boolean isMorning,boolean isMom,boolean isAsleep)
	{
		if (isAsleep==true)
		{
			return false;
		}
		else if (isMorning==true && isMom==true)
		{
			return true;
		}
		else if(isAsleep==false && isMorning==false)
		{
			return true;
		}
		else if(isMorning==false)
		{
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		boolean result;
		result=answerCell(false,false,false);
		System.out.println(result);
		result=answerCell(false,false,true);
		System.out.println(result);
		result=answerCell(true,false,false);
		System.out.println(result);

		
	}
}