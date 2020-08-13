public class Tasks
{
	public static void main(String[] args)
	{
		//Declaring variables
		int counter; //integer "teller" (Task A1 and A3)
		int number = -15; //integer "tall" (Task A2)
		int sum = 0;

		/*
		Task A1
		- Commas in for-loop are replaced with semicolon
		- Greater or equal changed to less or equal, given that count increases per run up to 20.
		- removed misplaced 1 from counter++1 in for-loop
		*/
		System.out.println("Task A1: prints out all numbers as of 10 even 20");
		for (counter=10; counter<=20; counter++)
			System.out.println (counter);

		/*
		Task A2
		- Added break after switch case, otherwisely you will continue to run the other cases.
		- Changed case 2 to default.
		*/
		System.out.println("\nTask A2: Checks the integer 'number' for remainder by division");
		switch (number % 2)
		{
		    case 0:
				System.out.println("The number " + number + " is even");
				break; //You must break after a switch case, otherwisely you will continue to run the other cases.

		    case 1:
				System.out.println("The number " + number + " is odd. ");
				break;

			case -1:
				System.out.println("The number " + number + " is odd (negative integer).");
				break;

		    default:
		         System.out.println("The number " + number + " is neither.");
		         break;
		}

		/*
		Task A3
		- Remove semicolon after for-loop line (the statement is not finished yet)
		- Changed +counter to counter++
		*/
		System.out.println("\nTask A3: Adds all numbers as of 10 even 25");

		for (counter = 10; counter <= 25; counter++)
			sum += counter;
		System.out.println("The sum is: " + sum + "\n");


		//Task B
		System.out.println("Task B: Draws a diamond shape made of asterisks using for-loops");
		//Top to center, line 1-4
		for(int i = 0; i<=3; i++)
			{
				for(int j=12; j>=i*4; j--)
					System.out.print(" ");
				for(int k=0; k<=i*4; k++)
				{
					System.out.print("*");
					System.out.print("*");
				}
		System.out.println();
				}

		//Bottom, line 5-7. This for-loop is the oppsite of the top to center.
		for(int i = 0; i<=2; i++)
		{
			for(int j=-4; j<=i*4; j++)
				System.out.print(" ");
			for(int k=8; k>=i*4; k--)
			{
				System.out.print("*");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
