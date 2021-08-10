class neon{
	public static int nen(int num)
	{    int numsq=num*num;
		int temp=numsq;
		int lastdigit;
		int sum=0;
		while (numsq>0)
		{
			lastdigit=numsq%10;
			sum=sum+lastdigit;
			numsq=numsq/10;
		}
		if (temp==sum)
		{
			System.out.println("number is neon number");
		}
		else{
			System.out.println("number is not a neon number");
		}
		return 0;
	}
	public static void main(String[] args) {
		int result;
		result=nen();
		
	}
}