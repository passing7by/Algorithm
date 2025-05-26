import java.util.Scanner;

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
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		sc.nextInt();
		sc.nextInt();
		
		// 1. 문자열 합치기
//		StringBuilder name1 = new StringBuilder("AB");
//		StringBuilder name2 = new StringBuilder("CD");
		StringBuilder name1 = new StringBuilder(sc.next());
		StringBuilder name2 = new StringBuilder(sc.next());
		
		StringBuilder resultName = new StringBuilder();
		
		// 긴 쪽에 짧은 쪽을 추가
		int insertIdx = 0;
		int nameIdx = 0;
		
		if (name1.length() < name2.length()) {
			while (true) {
				// name2의 currentIdx 값이 name1의 currentIdx 값 뒤에 들어가면 됨
				name2.insert(insertIdx, name1.charAt(nameIdx));
				// currentIdx가 0 2 4 6...와 같이 바뀌어야 하므로
				insertIdx += 2;
				nameIdx++;
				
				if(nameIdx == name1.length()) break;
			}
			
//			System.out.println(name2);
			resultName = name2;
		} else {
			while (true) {
				name1.insert(insertIdx + 1, name2.charAt(nameIdx));
				insertIdx += 2;
				nameIdx++;
				
				if(nameIdx == name2.length()) break;
			}
			
//			System.out.println(name1);
			resultName = name1;
		}
		
		// 이름 문자열을 획수 문자열로
		int idx = 0;
		StringBuilder strokes = new StringBuilder();
		
		while(true) {
			char target = resultName.charAt(idx);
//			System.out.println("target = " + target);
			
			switch (target) {
			case 'E' :
				strokes.append(4);
				break;
			case 'A', 'F', 'H', 'K', 'M' :
				strokes.append(3);
				break;
			case 'B', 'D', 'N', 'P', 'Q', 'R', 'T', 'X', 'Y' :
				strokes.append(2);
				break;
			default:
				strokes.append(1);
				break;
			}
			
			idx++;
			
			if(idx == resultName.length()) break;
			
//			System.out.println("strokes = " + strokes);
		}
		
//		System.out.println("strokes = " + strokes);
		
		// 2. 이름궁합 출력
		// 이름궁합 1회전 대상
//		String strokes = "1 3 4 1 4 2 1 3 1 1 2 3 1 3 2 1 1 3 3 1 2 3".replaceAll(" ", "");
		// 이름궁합 1회전 후의 결과를 담는 변수
		StringBuilder tempResult = new StringBuilder();
		// 이전 인덱스의 값 + 현재 인덱스의 값을 담는 변수
		int tempSum = 0;
		
		while(true) {
			for (int i = 1; i < strokes.length(); i++) {
				tempSum = Integer.parseInt(strokes.charAt(i - 1) + ""); // 1
//				System.out.println("tempSum = " + tempSum);
				
				tempSum += Integer.parseInt(strokes.charAt(i) + ""); // 4
				tempSum %= 10; // 합이 일의 자리가 넘는 경우 일의 자리만 남김 // 4
//				System.out.println("(strokes.charAt(" + (i - 1) + ") + " + "strokes.charAt(" + i + ")) % 10 = " + tempSum);
				
				tempResult.append(tempSum); // 4
//				System.out.println("tempResult = " + tempResult);				
			}
						
			strokes = new StringBuilder(tempResult); // 이름궁합 1회전 대상 초기화
//			System.err.println("이름궁합 1회전 대상 초기화 : " + strokes);

			
			tempResult.setLength(0); // 이름궁합 1회전 후의 결과를 담는 변수 초기화
//			System.err.println("이름궁합 1회전 후의 결과를 담는 변수 초기화 : " + tempResult);
			
			if(strokes.length() <= 2) break;
		}
		
		System.out.println(Integer.parseInt(strokes.toString()) + "%");
	}
}