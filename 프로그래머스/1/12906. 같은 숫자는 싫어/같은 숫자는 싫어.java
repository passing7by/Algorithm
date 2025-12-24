import java.util.*;

/*
배열에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
단, 배열의 순서 유지

시간복잡도: O(N) 이내

배열을 순회하면서, 현재 값과 가장 최근에 찾은 값을 비교해야 함 -> 스택 사용
*/

// 1. 배열에서 연속을 제거한 값들을 담을 Deque 생성 
// 2. 배열의 값들을 하나씩 확인
    // 2-1. 가장 최근 확인한 값과 현재값이 다르면 Deque의 가장 뒤에 추가
// 3. 결과로 반환할 배열 생성
// 4. 배열에 Deque의 값을 옮겨 담고 배열 반환
    
public class Solution {
    public int[] solution(int []arr) {
        // 1. 배열에서 연속을 제거한 값들을 담을 Deque 생성 
        Deque<Integer> deque = new ArrayDeque<>();
        
        // 2. 배열의 값들을 하나씩 확인
        for(int i : arr) {
            // 2-1. 가장 최근 확인한 값과 현재값이 다르면 Deque의 가장 뒤에 추가
            if(deque.peekLast() == null || deque.peekLast() != i) deque.offerLast(i);
        }
        
        // 3. 결과로 반환할 배열 생성
        int[] answer = new int[deque.size()];

        // 4. 배열에 Deque의 값을 옮겨 담고 배열 반환
        for(int i = 0; i < answer.length; i++) {
            answer[i] = deque.pollFirst();
        }

        return answer;
    }
}