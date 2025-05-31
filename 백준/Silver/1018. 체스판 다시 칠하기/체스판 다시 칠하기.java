import java.util.Scanner;

/*
 * 체스판을 칠하는 경우의 수는 두 가지
 * 1. 흰검흰검...
 * 2. 검흰검흰...
 * 
 * 8*8로 자르고 흰검흰검/검흰검흰 두 가지 경우의 수를 체크.....
 * 색깔 다르면 칠하는 횟수 1 증가
 */
public class Main {
	public static int checkFromWhite(String line) {
		String chessLine = "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW";
		int coloringCnt = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) != chessLine.charAt(i)) coloringCnt++;
		}
		
		return coloringCnt;
	}
	
	public static int checkFromBlack(String line) {
		String chessLine = "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB";
		int coloringCnt = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) != chessLine.charAt(i)) coloringCnt++;
		}
		
		return coloringCnt;
	}
	
	public static String cutBoard(String board, int boardWidth, int startIdx, int endIdx) {
		// 0~7, 0+너비~7+너비....8번 반복 후, 0+너비~7+너비부터 다시 8번 반복
		// 만약 0+너비...이 board.length보다 크다면 반복 중지
		// 시작 인덱스, 끝 인덱스를 1씩 증가시킨 후 1~8부터 다시 위의 반복 시작
		// 만약 끝 인덱스 == 너비 가 되면 반복 중지
		String cutResult = "";
		
		for (int i = 0; i < 8; i++) {
			cutResult += board.substring(startIdx, endIdx + 1);
			startIdx += boardWidth;
			endIdx += boardWidth;
		}
		
//		System.out.println("[cutResult]: " + cutResult);
		
		return cutResult;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		// N,M을 입력받음
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		// N*M만큼 입력받은 값들을 저장할 String 생성
		String board = "";
		
		for (int i = 0; i < n; i++) { // N번 반복
			board += sc.nextLine();
		}
		
		// 8*8 만큼의 길이로 자르기
		int minColoringCnt = Integer.MAX_VALUE;
		
		int startIdxOnLine = 0;
		int endIdxOnLine = 7;
		int startIdx = 0;
		int endIdx = 7;
		while (true) {
			for (int i = 0; i <= n - 8; i++) {
				String str = cutBoard(board, m, startIdx, endIdx);
				
				// case1: 흰색부터 시작
				int checkresult = checkFromWhite(str);
//				System.out.println("[checkresult1]: " + checkresult);
				minColoringCnt = checkresult < minColoringCnt ? checkresult : minColoringCnt;
				
				// case2: 검은색부터 시작
				checkresult = checkFromBlack(str);
//				System.out.println("[checkresult2]: " + checkresult);
				minColoringCnt = checkresult < minColoringCnt ? checkresult : minColoringCnt;
				
				startIdx += m;
				endIdx += m;
			}
//			System.out.println("빠져나옴");
			
			startIdx = ++startIdxOnLine;
			endIdx = ++endIdxOnLine;
			
			if (endIdxOnLine == m) break;
		}
		
		System.out.println(minColoringCnt);
	}
}
