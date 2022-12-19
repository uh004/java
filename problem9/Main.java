package _9; // 각 자릿수 합 구하기

public class Main {

	public static void main(String[] args) {
		
		int inputNum = 1232;
		int accSum = 0;
		
		
		// 1232 -> 123 -> 12 -> 1  10으로 나눈 몫  -> 몫이 0이될때 break
		// 2		3 	  2		1 -> 8 10으로 나눈 나머지
		
		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		System.out.println(accSum);
	}

}
