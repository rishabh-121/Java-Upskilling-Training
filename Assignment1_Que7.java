import java.util.Scanner;

public class Assignment1_Que7 {
	
	public static void main(String []args)
	{
	int[] num = { 1, 16, 23, 65, 22, 87, 94, 12, 24, 65, 14, 78, 96, 91, 55 };

	int flag = 0;

	Scanner abc = new Scanner(System.in);

	System.out.println("Enter a number to search: ");

	int num1 = abc.nextInt();

	for(
	int i = 0;i<num.length;i++)
	{

		if (num[i] == num1) {

			System.out.println("Match found at position: " + i);

			flag = 1;

		}

	}

	if(flag==0)
	{

		System.out.println("Match not found");

	}

}
	

}
