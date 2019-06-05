package Rwatch.Rwatch;

public class Febonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int num= 0;
		for(int i=1;i<10;i++) {
			System.out.println(num);
			num= a+b;
			a=b;
			b=num;
			
		}

	}

}
