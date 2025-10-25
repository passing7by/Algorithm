import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] solution(int[] numbers) {

        // 더할 수 있는 모든 경우의 수는 numbers.length * (numbers.length - 1)
        // 하지만 더한 결과가 중복되는 경우에는 중복을 제거하고 answer에 담아야 함
        // 1. 중복을 제거하기 위해 결과를 set에 담기
        // 2. set에 담은 후 set을 answer에 옮겨담던지, 배열로 변환하던지 하기
        // 3. 오름차순 정렬하기
        // 특정 인덱스의 값을 모든 인덱스의 값과 더하되, 특정 인덱스 == 더할 인덱스면 건너뛰기

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }

        System.out.println("set: " + set);

        int[] answer = new int[set.size()];
        int idx = 0;
        for(Integer i : set) {
            answer[idx++] = i;
        }

        Arrays.sort(answer);

        return answer;

    }

//    public static void main(String[] args) {
//
//        Solution s = new Solution();
//
//        int[] result = s.solution(new int[]{2,1,3,4,1});
//    }

}