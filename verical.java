class verical{
	public static void ver(int num)
	{
		int lastdigit;
		int sum=0;
		while (num>0)
		{
			lastdigit=num%10;
			sum=(sum*10)+lastdigit;
			num=num/10;
		}
		int last;
		while (sum>0)
		{
			last=sum%10;
			System.out.println(last);
			sum=sum/10;
		}
		
	}
	public static void main(String[] args) {
		ver(123);
		
	}
}