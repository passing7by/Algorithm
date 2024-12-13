import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 케이스는 여러개, 마지막 줄에 [0 0 0]이 입력되면 입력 멈춤
		// 각각의 케이스의 숫자 범위 : (1 ~ 29,999)
		// 각각의 숫자는 변의 길이를 의미
		// 출력 : 각 케이스에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"
		
		//1. 케이스들을 입력, [0 0 0]이 입력되면 입력 끝
		//2. 각 케이스마다 직각삼각형 여부 검증, 출력
		
		Scanner sc = new Scanner(System.in);
		
		//1.
		boolean flag = true;
		
		while (flag) {
			//입력
			int[] nums = {
				sc.nextInt(),
				sc.nextInt(),
				sc.nextInt()	
			};
			
			//만약 nums의 합이 0이면 flag를 false로 변경, 아닐 시 밑의 코드 진행
			int numsSum = 0;
			
			for (int num : nums) {
				numsSum += num;
			}
			
			if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
				flag = false;
				sc.close();
			} else {
				//검증과 출력 - 빗변의 제곱은 나머지 두 변의 제곱의 합과 같음
				//빗변 = 가장 큰 수
				int max = 0;
				int maxIndex = 0;
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] > max) {
						max = nums[i];
						maxIndex = i;
					}
				}
				
				//그 전에 나머지 변인지를 검증하고 그것의 제곱합을 구해야 함
				//num의 인덱스 != maxIndex
				
				int sum = 0;
				
				for (int i = 0; i < nums.length; i++) {
					if(i != maxIndex) {
						sum += Math.pow(nums[i], 2); 
					} //if
				} //for
				
				//빗변이 아닌 나머지 변의 제곱합이 max의 제곱과 같아야 함
				if (Math.pow(max, 2)==sum) System.out.println("right");
				else System.out.println("wrong");
			}
		} //while
	}
}