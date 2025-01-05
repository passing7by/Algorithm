import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1. 케이스 갯수가 입력됨
		//2. 케이스 하나당 한 행에 [층 방 순서]의 형식으로 입력됨
		//3. 출력 : 케이스 하나당 한 행에 '순서'에 해당하는 손님에게 배정되는 방 번호
		
		/*
		 만약 [6 12 10] 이 케이스 중 하나로 입력됐다면?
		 6 4
		 두 번째 방의 4층 = 4/02
		 만약 [30 50 72] 이 케이스 중 하나로 입력됐다면?
		 30 30 12
		 세 번째 방의 12층 = 12/03
		 만약 [30 50 30] 이 케이스 중 하나로 입력됐다면?
		 30
		 첫 번째 방의 30층 = 30/01
		 
		 이 생각의 흐름을 로직으로 옮기면?
		 방 = 순서를 층으로 나눈 몫 +1 (순서/층 +1)
		 	순서를 층으로 나눈 나머지(순서%층)가 0일 경우, 방 = 순서를 층으로 나눈 몫
		 층 = 순서를 층으로 나눈 나머지 (순서%층)
		 	순서를 층으로 나눈 나머지(순서%층)가 0일 경우, 층 = 가장 높은 층
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		int floor = sc.nextInt();
		int room = sc.nextInt();
		int num = sc.nextInt();
		
		int rFloor = 0;
		int rRoom = 0;
		
		if (num%floor == 0) {
			rRoom = num/floor;
			rFloor = floor;
		} else {
			rRoom = num/floor +1;
			rFloor = num%floor;
		}
		
		System.out.println(rFloor + " / " + rRoom);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < caseNum; i++) {
			String tc = sc.nextLine();
			
			String[] array = tc.split(" ");
			int[] intArray = new int[array.length];
			
			for (int j = 0; j < array.length; j++) {
				intArray[j] = Integer.parseInt(array[j]);
			}
			
			//0 층 1 방 2 순서
			int floor = intArray[0];
			int room = intArray[1];
			int num = intArray[2];
			
			int rFloor = 0;
			int rRoom = 0;
			
			if (num%floor == 0) {
				rRoom = num/floor;
				rFloor = floor;
			} else {
				rRoom = num/floor +1;
				rFloor = num%floor;
			}
			
			String result = "";
			
			switch (String.valueOf(rRoom).length()) {
				case 1: {
					result = rFloor + "0" + rRoom;
					break;
				}
				case 2: {
					result = rFloor + "" + rRoom;
					break;
				}
			} //switch
			System.out.println(result);
		} //for
	} //main
} //Main