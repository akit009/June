package Rwatch.Rwatch;

public class Palindrome_String {

	public static void main(String[] args) {

		String str = "Ankit is working";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

			
		}
		System.out.println("Reverse of the string: " + reverse);

		if (str.equals(reverse))
			System.out.println("Palindrome String");

		else
			System.out.println(" Not a Palindrome String");

	
	StringBuffer st = new StringBuffer(str);
	System.out.println(st.reverse());
	
	
	
	}
}
