import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 테스트 케이스의 개수가 주어짐 (테스트 케이스 갯수의 제한은 없는 건지?)
		//2. 각 테스트 케이스마다 한 행씩 O또는X로 이루어진 문자열이 주어짐 (문자열의 길이 : 1 ~ 79)
		//3. 각 테스트 케이스에 해당하는 점수를 행마다 출력
		//점수의 법칙 : O가 연속되는 만큼 O하나에 해당하는 점수가 1부터 1씩 증가함
		
		//점수의 법칙을 어떻게 로직으로 풀어낼지부터 생각해 보자
		/*
		String str = "OOXXOXXOOO";
		
		int sum = 0;
		for (String s : str.split("X")) {
			int cntO = 0;
			int sumO = 0;
			for (char c : s.toCharArray()) {
				cntO++;
				sumO += cntO;
			} //for
			sum += sumO;
		} //for
		System.out.println(sum);
		*/
		
		//1.
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		
		//2.
		for (int i = 0; i < tc; i++) {
			String str = sc.next();
			
			int sum = 0;
			for (String s : str.split("X")) {
				int cntO = 0;
				int sumO = 0;
				for (char c : s.toCharArray()) {
					cntO++;
					sumO += cntO;
				} //for
				sum += sumO;
			} //for
			System.out.println(sum);
		} //for
	}
}