import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 숫자를 입력
		//2. 숫자*1 = 결과값 -> 1부터 9까지 반복
		
		//1. 숫자 입력
		Scanner s = new Scanner(System.in);
		int inputNum = s.nextInt();
		
		//2.
		for (int i = 1; i <= 9; i++) {
			int result = inputNum*i;
			System.out.println(inputNum +  " * " + i + " = " + result);
		}

	}

}