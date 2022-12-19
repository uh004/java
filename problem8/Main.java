package _8; // 팩토리얼 5! 5x4x3x2x1 = 120

public class Main {

	public static void main(String[] args) {
		
		int inputNum = 7;
		int accNum = 1;
		
		// 5! = 5x4x3x2x1 = 120
		// 7! = 7x6x5x4x3x2x1 
		
		for(int i = 1;i <= inputNum; i++) {
			accNum *= i; // accNum = accNum * i
		}
		
		System.out.println(accNum);
		
		accNum = 1;
		for(int i = inputNum;i >= 1; i--) {
			accNum *= i; // accNum = accNum * i
		}
		
		System.out.println(accNum);
	}

}
