import java.util.*;

/*
시간복잡도: O(n^4) 이내

i번째부터 j번째까지를 잘라서 k를 확인한다는 동일한 작업을 3번 반복 -> 메서드로 분리
*/

// 1. 아래를 3번 반복
    // 1-1. i번째부터 j번째까지 자름
    // 1-2. 자른 배열을 정렬
    // 1-3. k번째 수를 반환
    // 1-4. 반환받은 수를 결과 배열에 저장
// 2. 결과 배열 반환

class Solution {
    private static int findK(int[] array, int[] command) {
        int[] sliced = new int[command[1] - command[0] + 1];   
        
        // 1. i번째부터 j번째까지 자름
        int idx = 0;
        for(int i = command[0] - 1; i < command[1]; i++) {
            sliced[idx] = array[i];
            idx++;
        }
        
        // 2. 자른 배열을 정렬
        Arrays.sort(sliced);
        
        // 3. k번째 수를 반환
        return sliced[command[2] - 1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 1. 아래를 commands 길이만큼 반복
        for(int i = 0; i < commands.length; i++) {
            // 1-1. k번째 수를 반환받아 결과 배열에 저장
            answer[i] = findK(array, commands[i]);
        }

        // 2. 결과 배열 반환
        return answer;
    }
}