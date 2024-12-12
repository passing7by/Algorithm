import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 첫째 줄에 정수의 개수 입력 (1~1,000,000)
		//2. 둘째 줄에 n개의 정수를 공백으로 구분하여 입력 (범위 : -1,000,000 ~ 1,000,000)
		//3. 한 중에 최솟값과 최댓값을 공백으로 구분해 출력
		
		Scanner sc = new Scanner(System.in);
		
		//1.
		int input1 = sc.nextInt();
		
		//2.
		List<Integer> input2 = new ArrayList<Integer>();
		
		for (int i = 0; i < input1; i++) {
			input2.add(sc.nextInt());
		}
		
		//3.
		int max = input2.get(0);
		int min = input2.get(0);
		
		for (int i = 0; i < input2.size(); i++) {
			int now = input2.get(i);
			
			if (now > max) {
				max = now;
			}
			
			if (now < min) {
				min = now;
			}
		}
		
		System.out.println(min + " " + max);
	}
}