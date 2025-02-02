import java.util.Arrays;
import java.util.Scanner;

// 1. 정수의 갯수가 입력 (범위: 1 ~100)
// 2. 정수가 주어짐
// 3. 정수의 갯수가 입력 (범위: 1 ~100)
// 4. 정수가 주어짐
// 출력 : 4에 주어진 수가 2에 존재한다면 1을, 아니면 0을 한 줄에 하나씩 출력
public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		// 로직 & 출력
		/*
		 * arr2[0]이 arr1에 존재하는지 확인하고, 확인한 뒤 1 혹은 0 출력
		 */
		
		// 이진 탐색을 사용하기 위한 정렬
		Arrays.sort(arr1);
		
		for (int i = 0; i < num2; i++) { // arr2			
			int target = arr2[i];
			int isExist = 0;
			
			// 이진 탐색으로 풀어야 함....
			int left = 0, right = num1-1;
			
			while (left <= right) { // arr1				
				int mid = left + (right-left) / 2;
				if (target == arr1[mid]) {
					isExist = 1;
					break;
				}
				else if (target >= arr1[mid]) left = mid+1;
				else right = mid-1;
			}
			
			System.out.println(isExist);
		}
	}
}