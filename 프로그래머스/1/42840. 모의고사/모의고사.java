import java.util.*;

public class Solution {

    public int[] solution(int[] answers) {

        // 1번: 1, 2, 3, 4, 5 // 0~4
        // 2번: 2, 1, 2, 3, 2, 4, 2, 5 // 0~7
        // 3번: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 // 0~9

        // answers 인덱스만큼 반복
        // 1번 수포자의 인덱스는 0~4까지 변화, 4 다음에는 0
        // 2번 수포자의 인덱스는 0~7까지 변화, 7 다음에는 0
        // 3번 수포자의 인덱스는 0~9까지 변화, 9 다음에는 0

        // 맞힌 횟수를 세고, 맞힌 횟수가 동일하면 번호 오름차순 정렬
        // 1. 가장 많이 맞춘 횟수를 저장
        // 2. 가장 많이 맞춘 횟수를 담고 있는 인덱스를 알아내기
        // 3. 오름차순으로 반환

        int[] idxs = new int[3];
        int[][] nums = {{1, 2, 3, 4, 5},
                        {2, 1, 2, 3, 2, 4, 2, 5},
                        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] correctCounts = new int[3];

        for(int a : answers){
            if(a == nums[0][idxs[0]++]) correctCounts[0]++;
            if(a == nums[1][idxs[1]++]) correctCounts[1]++;
            if(a == nums[2][idxs[2]++]) correctCounts[2]++;

            if(idxs[0] == nums[0].length) idxs[0] = 0;
            if(idxs[1] == nums[1].length) idxs[1] = 0;
            if(idxs[2] == nums[2].length) idxs[2] = 0;
        }

        int max = 0;
        for(int i : correctCounts){
            max = Math.max(max, i);
        }

        List<Integer> persons = new ArrayList<>();
        for(int i = 0; i < correctCounts.length; i++) {
            if(correctCounts[i] == max) persons.add(i);
        }
        int[] result = new int[persons.size()];
        for(int j = 0; j < result.length; j++){
            result[j] = persons.get(j) + 1;
        }

        return result;

    }
    
}