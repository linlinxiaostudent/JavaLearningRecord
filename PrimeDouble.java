package niuke;

import java.util.Scanner;

public class PrimeDouble {
	 public boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		for (int i = 2; i <n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		System.out.println(n);
		PrimeDouble p = new PrimeDouble();
		//System.out.println(p.isPrime(3));
		for (int i = 2; i <= (n / 2) + 1; i++) {
			if (p.isPrime(i)) {
				//System.out.println(i);
				if (p.isPrime(n - i))
					count = count + 1;
			}
		}
		System.out.println(count);
	}

}
