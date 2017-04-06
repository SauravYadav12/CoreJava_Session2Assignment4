class TestDemo{
	public static void main(String[] args)
	{
		System.out.print("Enter the No. :");
		int num = Integer.parseInt(System.console().readLine());

		if (num == 0)
		{
			System.out.println("You have Entered Zero.");
		}
		else if (num < 0)
		{
			System.out.println("You have Entered Negative Value.");
		}
		else
		{
			System.out.println("You have Entered Positive Value.");
		}
	}
}