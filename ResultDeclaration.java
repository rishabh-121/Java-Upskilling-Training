import java.util.Scanner;

public class ResultDeclaration {
	
	void result(int sub1, int sub2, int sub3)
	{
		if (sub1>60 &sub2>60 &sub3>60 )
			System.out.println("Passed");
		else if ((sub1>60 &sub2>60 &sub3<60)||(sub1>60 &sub2<60 &sub3>60) || (sub1<60 &sub2>60 &sub3>60 ) ) 
			System.out.println("Promoted");
		else 
			System.out.println("Failed");
	}

	public static void main(String[] args) {
	ResultDeclaration rDeclaration=new ResultDeclaration();
	int a,b,c;
	System.out.println("Enter 3 subjects marks out of 100");
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=scanner.nextInt();
	rDeclaration.result(a, b, c);

	}

}
