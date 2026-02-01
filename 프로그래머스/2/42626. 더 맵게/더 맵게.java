/*
  시간복잡도: O(n) 이하

  한 번 섞으려 할 때마다 가장 낮은 스코빌 지수와 두 번째로 낮은 스코빌 지수를 찾아야 함
  우선순위 큐 사용?
  한 번 섞었을 때마다 가장 낮은 스코빌 지수가 k가 넘는지 확인

  모든 음식의 스코빌 지수를 k 이상으로 만들 수 없는 경우를 어떻게 판단?
  요소가 하나밖에 안 남은 상태에서, 그 요소의 값이 k보다 작은 경우
*/

// 1. 우선순위 큐 생성 (정렬 조건은 오름차순)
// 2. 배열을 큐에 담음
// 3. 섞은 횟수를 저장하는 변수 mixCnt 생성
// 3. 큐의 요소들을 하나씩 꺼냄 (꺼낸 요소: a)
    // 3-1. a >= k면 mixCnt 반환
    // 3-2. a < k면 요소를 또 꺼내서(b) a + (b * 2)를 큐에 넣음
        // b를 꺼낼 수 없을 경우 -1 반환

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int solution(int[] scoville, int k) {
        // 1. 우선순위 큐 생성 (정렬 조건은 오름차순)
        Queue<Integer> queue = new PriorityQueue<>();

        // 2. 배열을 큐에 담음
        for(int i : scoville) {
            queue.add(i);
        }

        // 3. 섞은 횟수를 저장하는 변수 mixCnt 생성
        int mixCnt = 0;

        // 3. 큐의 요소들을 하나씩 꺼냄 (꺼낸 요소: a)
        while(!queue.isEmpty()) {
            int a = queue.poll();

            // 3-1. a >= k면 mixCnt 반환
            if(a >= k) break;
            // 3-2. a < k면 요소를 또 꺼내서(b) a + (b * 2)를 큐에 넣음
                // b를 꺼낼 수 없을 경우 -1 반환
            else if(queue.isEmpty()) {
                mixCnt = -1;
                break;
            }
            else {
                int b = queue.poll();
                queue.add(a + 2 * b);
                mixCnt++;
            }
        }

        return mixCnt;
    }
}