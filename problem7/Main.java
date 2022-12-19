package _7; // 소수 판별

public class Main {

	public static void main(String[] args) {
		int num = 104;
		
		boolean isPrimeNumber = true;
		
		for(int i = 2; i <= num /2; i++) {
			if(num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}
		if(isPrimeNumber) {
			System.out.println(num + " 은 소수 입니다.");
		}
		else {
			System.out.println(num + " 은 소수가 아닙니다.");
		}

	}

}
