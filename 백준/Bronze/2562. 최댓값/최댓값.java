import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1. 자연수 9개를 행마다 입력받는다 (범위 : 1~99) (단, 모든 자연수는 서로 다름)
		//2. 최댓값을 구한다
		//3. 최댓값에 해당하는 자연수의 순서값을 구한다
		
		//1
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 1; i <= 9; i++) {
			numList.add(sc.nextInt()); 
		}
		
		//2, 3
		//최대값의 초기값
		int max = numList.get(0);
		int index = 1;
		
		for (int i = 0; i < numList.size(); i++) {			
			int now = numList.get(i);
			
			if(now>max) {
				max = now;
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}