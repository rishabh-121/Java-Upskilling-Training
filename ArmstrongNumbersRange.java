import java.util.Scanner;

public class ArmstrongNumbersRange {

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
	int num=999;   
	  
	ArmstrongNumber objArmstrongNumber=new ArmstrongNumber();
	System.out.println("Armstrong Numbers falling in the range of 100 to 999 are: "); 
	for(int i=100;i<=num;i++)
	{
	if(objArmstrongNumber.isArmstrong(i))  
	{  
	System.out.println(i);  
	}  
	  
	}   
	} } 
