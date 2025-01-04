import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 1. 두 정수가 입력됨
		 	범위 : 첫번째 정수 - 0 ~ 23 / 두번째 정수 - 0 ~ 59
		 	불필요한 0은 사용하지 않음
	 	 2. 설정해야하는 알람 시간 출력
	 	 	입력받은 시간보다 45분 앞선 시간
	 	 	출력 형식 : 입력과 같은 형태
		 */
		
		//일단 분만 입력됐을 때 -45을 출력해 보자
		//만약 10분이 입력된다면, 단순히 -35를 출력하는 것이 아닌, 25분을 출력해야 함
		/*
		 25분을 출력하려면 어떻게 해야 하지?
		 만약 45와 같거나 45보다 크면 그냥 45에서 빼면 됨
		 만약 45보다 작으면 입력된 숫자에 60을 더한 뒤에 빼야 함
		 */
		/*
		int min = 55;
		int result = 0;
		if (min < 45) {
			result = min+60-45;
		} else {
			result = min-45;
		}
		System.out.println(result); //10 입력시 25, 55입력시 10
		*/
		
		//이제 시까지 고려하자
		/*
		 시까지 고려 시,
		 만약 분이 45와 같거나 45보다 크면 분을 그냥 45에서 빼고, 시는 바뀌지 않음
		 만약 분이 45보다 작으면 입력된 분에 60을 더한 뒤에 빼고, 시는 -1
		 	근데 시가 0이면?
		 	시가 0이면 24를 더한 뒤 -1
		 	시간 0이 아니면 그냥 -1
		 	
		 그럼 케이스가 몇 개 나오지?
		 1. 시>=1, 분>=45 / 1 45
		 2. 시>=1, 분<45 / 1 30
		 3. 시=0, 분>=45 / 0 45
		 3. 시=0, 분<45 / 0 30
		 */
		
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int rHour = 0;
		int rMin = 0;
		
		if (min < 45) {
			if (hour == 0) {
				rHour = hour+24-1;
				rMin = min+60-45;
			} else {
				rHour = hour-1;
				rMin = min+60-45;
			}
		} else {
			rHour = hour;
			rMin = min-45;
		}
		System.out.println(rHour + " " + rMin);
	} //main
} //Main