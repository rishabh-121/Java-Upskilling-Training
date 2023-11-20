import java.util.Scanner;

public class Assignment1_Que6 {

	public static void main(String[] args) {
		String userid ="Cg_training";
		String Password ="Training";
		Scanner input = new Scanner(System.in);
		
		
		for(int i=3; i>=1; i--) {
			System.out.println("Enter the user id ");
			String user_Id1 = input.nextLine();
			System.out.println("Enter user password :");
			String password1= input.nextLine();
			
			
			
			if((userid.matches(user_Id1))&& (Password.matches(password1))) {
				System.out.println("Welcome" + userid);
				break;
			}
			
			
			else {
				System.out.println("Login Failed Attempts remaining "+(i-1));
				System.out.println("");
				if(i==1) {
					System.out.println("Contact Admin");
				}
			}
				
		}
		
			
 
	}
 
}
		 
	


