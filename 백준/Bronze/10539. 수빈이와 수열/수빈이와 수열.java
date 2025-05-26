import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1. 첫째 줄에 수열 B의 길이(1~100)가 입력됨
		// 2. 둘째 둘에 길이만큼 정수가 주어짐(범위:1~10^9)
		// 3. 출력: 수열 A를 이루는 정수들(구분:공백)
		
		/*
		 * 입력(y): 1, 2, 2, 3, 4
		 * 1/1, (1+3)/2, (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5 의 반대를 실행
		 * 출력(x): 1, 3, 2, 6, 8
		 * n = 현재 순서
		 * x1/n = y
		 * x1 = yn
		 * (x1+x2)/n = y
		 * x1+x2 = yn
		 * x2 = yn - x1
		 * n을 곱한 뒤, 이전 순서의 값들의 합을 빼면 됨
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int lenB = sc.nextInt();
		int[] seqB = new int[lenB];
		
		for (int i = 0; i < seqB.length; i++) {
			seqB[i] = sc.nextInt();
		}
		
		int sumOfPreNums = 0;
		
		for (int i = 0; i < seqB.length; i++) {
			int n = i + 1;
			int a = seqB[i] * n - sumOfPreNums;
			sumOfPreNums += a;
			System.out.print(a + " ");
		}
	}
}