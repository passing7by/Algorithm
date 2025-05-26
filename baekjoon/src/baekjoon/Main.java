package baekjoon;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// 1. 첫째 줄에 두 이름의 길이(2~100), 둘째 줄에 이름 A와 B를 입력받음(대문자)
		// 2. 출력: 이름궁합(단, 십의 자리가 0일 경우엔 일의 자리만 출력)
		
		/*
		 * 입력받은 문자열을 한 문자씩 번갈아가며 합치고, 문자가 남으면 뒤에 붙임
		 * 합친 문자열을 획수로 바꾸고
		 * 1 3 4 1 4 2 1 3 1 1 2 3 1 3 2 1 1 3 3 1 2 3
		 *   4 7 5 5 6 3 4 4 2 3 5 4 4 5 3 2 4 6 4 3 5
		 *     1 2 0 1 9 7 8 6 5 8 9 8 9 8 5 6 0 0 7 8
		 * ...
		 * 5 7 0
		 *   2 7
		 * 수행 후 출력
		 */
		/*
		 * 570%10 = 0
		 * 570/10 = 57
		 * 57%10 = 7
		 * 7
		 * 57/10 = 5
		 * 5%10 = 5
		 * (7+5)*10+7 = 127 -> 27
		 * 27
		 * 근데 이런 정수 연산으로 못함...왜? 최대 200자리니까
		 * => 문자열을 조작해야 할 듯
		 */
		
		// 1. 문자열 합치기
		
		// 2. 이름궁합 출력
		String numOfstrokes = "1 3 4 1 4 2 1 3 1 1 2 3 1 3 2 1 1 3 3 1 2 3".replaceAll(" ", "");
		int tempSum = Integer.parseInt(String.valueOf(numOfstrokes.charAt(0)));
//		System.out.println(tempSum); // 5
		StringBuilder tempResult = new StringBuilder();
		while(true) {
			for (int i = 1; i < numOfstrokes.length(); i++) {
				tempSum += Integer.parseInt(String.valueOf(numOfstrokes.charAt(i))); // 12
				System.err.println(tempSum);
				tempSum %= 10; // 합이 일의 자리가 넘는 경우 일의 자리만 남김 // 2
				System.err.println(tempSum);
				tempResult.append(tempSum); // 2
				System.err.println(tempResult);
				tempSum = Integer.parseInt(String.valueOf(numOfstrokes.charAt(i))); // 7
				System.err.println(tempSum);
			}
			
			System.out.println(tempResult);
			
			numOfstrokes = tempResult.toString();
			tempResult.delete(0, tempResult.length());
			System.err.println(tempResult);
			
			if(numOfstrokes.length() <= 2) break;
			
			Thread.sleep(1000);
		}
		
		
		
		
		
	}
}