import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 케이스 갯수 입력
		//2. 케이스의 갯수만큼 A+B 입력
		//3. A+B 결과 출력
		
		//1. 케이스 갯수 입력
		Scanner s = new Scanner(System.in);
		int caseNum = Integer.parseInt(s.nextLine());
		
		List<Integer> results = new ArrayList<Integer>();
		
		//2. 케이스의 갯수만큼 A+B 입력
		for (int i = 1; i <= caseNum; i++) {
			int first = Integer.parseInt(s.next());
			int second = Integer.parseInt(s.nextLine().trim());
			
			int result = first + second;
			results.add(result);
		}
		
		//3. A+B 결과 출력
		for (Integer integer : results) {
			System.out.println(integer);
		}
	}
}