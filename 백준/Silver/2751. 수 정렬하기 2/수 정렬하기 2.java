import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 최대 입력 : 1,000,000 (10^6)
// 허용되는 시간복잡도 : O(n) / O(n log n) / O(log n)
// 최소 O(n)의 시간이 필요 : 정렬 자체가 모든 요소를 최소 한 번 이상 확인해야 하므로
// O(log n)는 불가능 : 정렬 문제에서는 일반적으로 O(log n) 알고리즘이 적용되지 않음
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 배열 정렬
        Arrays.sort(arr);
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}