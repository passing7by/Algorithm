import java.util.Scanner;

public class Main {
	public int countPrimes(int num, int[] arr) {
		int answer = 0;
		
		for (int i : arr) {
			boolean isPrime = true;
			
			if (i == 1) isPrime = false;
			// i = 1 : 소수가 아님
			else {
				for (int j = 2; j < i; j++) {
					if (i%j == 0) isPrime = false;
				}
			}
			// i = 2 : 소수임 (else문에서 for문이 돌지 않고 나와 isPrime = true)
			// i > 2 : i를 j로 나눈 나머지가 0이면(즉, 1과 자신을 제외한 약수가 있으면) 소수가 아님
			
			if (isPrime) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		// 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 출력
		System.out.println(m.countPrimes(num, arr));
	}
}