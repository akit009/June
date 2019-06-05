package Rwatch.Rwatch;

public class Palindrome {

	public static void main(String []args) {
		
		int num = 12345;
		int temp =num;
		int x =0;
		while(num>0) {
			x= x*10 + num%10;
			num= num/10;
			System.out.println(x);
			
		}
		
		
		if(temp == x) 
			  System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			} 
	}

