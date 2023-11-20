import java.util.Scanner;

public class Assignment1_Que3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal = input.nextDouble();
		
		System.out.println("Enter the rate :");
		double rate = input .nextDouble();
		
		System.out.println("Enter The Duration :");
		double time = input.nextDouble();
		
		double simpleIntrest =(principal*rate*time)/100;
		
		System.out.println("Enter the number of time interest is Componded");
		double number = input.nextDouble();
		
		double compoundIntrest = principal *(Math.pow((1+rate/100),(time * number )))-principal;
		System.out.println("simple Intrest is : "+simpleIntrest);
		
		System.out.println("Compound intrest is :"+compoundIntrest);
		
		
		
	
	
	
	}
}
