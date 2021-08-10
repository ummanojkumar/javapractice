/*5)Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"*/

class exam1p5
{
	public static void alarmClock(int week,boolean isVacation)
	{
		if (isVacation==false && (week== 1 || week==2 || week==3 || week==4 || week==5 || week==6 ))
		{
			System.out.println("7:00");
		}
		else if(isVacation==false && week==0)
		{
			System.out.println("10:00");
		}
		else if(isVacation==true && (week== 1 || week==2 || week==3 || week==4 || week==5 || week==6 ))
		{
			System.out.println("10:00");
		}
		else if(isVacation==true && week==0)
		{
			System.out.println("off");
		}
	}
	public static void main(String[] args) 
	{
		alarmClock(1,false);
		alarmClock(5,false);
		alarmClock(0,false);
	}
}