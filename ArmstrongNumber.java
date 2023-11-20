import java.util.Scanner;

public class ArmstrongNumber {
	
	boolean isArmstrong(int n)   
	{   
	int temp, digits=0, remainder=0, sum=0;   
	temp=n; 
	
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}  
	
	temp = n; 
	
	while(temp>0)   
	{       
	remainder = temp % 10;    
	sum +=  (Math.pow(remainder, digits));    
	temp = temp/10;   
	}  
	
	if(n==sum)    
	return true;      
	else return false;   
	}    
	public static void  main(String args[])     
	{     
	int num;   
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	ArmstrongNumber objArmstrongNumber=new ArmstrongNumber();
	num=sc.nextInt();  
	if(objArmstrongNumber.isArmstrong(num))  
	{  
	System.out.print("Armstrong ");  
	}  
	else   
	{  
	System.out.print("Not Armstrong ");  
	}  
	}   
	}  

	

