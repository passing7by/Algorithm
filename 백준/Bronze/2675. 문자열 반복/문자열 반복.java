import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스 개수 입력
        int t = sc.nextInt();

        // 2. 테스트 케이스 반복 처리
        for (int i = 0; i < t; i++) {
            int repeat = sc.nextInt();  // 반복 횟수
            String str = sc.next();    // 반복할 문자열

            // 결과를 즉시 출력
            for (char c : str.toCharArray()) {
                for (int j = 0; j < repeat; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();  // 각 케이스별 줄 바꿈
        }

        sc.close();
    }
}
