class StudentMarks{
	public static void main(String[] args)
	{
		System.out.println("Enter marks :");
		int marks = Integer.parseInt(System.console().readLine());

		System.out.println("Enter age :");
		int age = Integer.parseInt(System.console().readLine());

		if((marks > 70) || (marks > 60 && age < 15))
		{
			System.out.println("Grade A");
		}
		else if ((marks > 60 && marks <= 70) || (marks >= 45 && marks <= 60 && age < 15))
		{
			System.out.println("Grade B");
		}
		else if ((marks < 61 ) || (marks < 45 && age < 15))
		{
			System.out.println("Grade C");
		}
		else {

			System.out.println("Age or marks not matching the condition");
		}
	}
}