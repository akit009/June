package Rwatch.Rwatch;

public class PrimeNo {

	public static void main(String[] args) {

		int no = 4;
		boolean isprime = true;
		for (int i = 2; i <= no/2; i++) {
			int num = no % i;

			if (num == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println("Prime no");

		} else {
			System.out.println("Not a prime");
		}
	}

}
