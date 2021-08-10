class teaparty{
	public static int tea(int tea,int candy)
	{
		int bad=0;
		int good=1;
		int great=2;
		 if (tea<5 || candy<5)
		{
			return bad;
		}
		else if (tea>=2*candy || candy>=2*tea)
		{
			return great;
		}
		else if (tea>=5 && candy >=5)
		{
			return good;
		}
		
		


		return 0;
	}
	public static void main(String[] args) {
		int result;
		result=tea(6,8);
		System.out.println(result);
		
	}
}