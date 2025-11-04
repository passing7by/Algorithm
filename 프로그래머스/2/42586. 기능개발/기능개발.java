import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        // 0. 변수 선언
        List<Integer> answerList = new ArrayList<>();
        LinkedList<Integer> progressesQueue = new LinkedList<>();
        LinkedList<Integer> speedsQueue = new LinkedList<>();
        Arrays.stream(progresses).forEach(progressesQueue::offer);
        Arrays.stream(speeds).forEach(speedsQueue::offer);

        System.out.println("progressesQueue: " + progressesQueue);
        System.out.println("speedsQueue: " + speedsQueue);

        // -------- 반복문 시작
        while(!progressesQueue.isEmpty()){
            // 1. progresses 의 각 요소에 speeds 의 각 요소를 더함 (만약 맨 앞의 값이 100이면 더하지 않음)
            for(int i = 0; i < progressesQueue.size(); i++) {
                progressesQueue.set(i, progressesQueue.get(i) + speedsQueue.get(i));
            }

            System.out.println("변경된 progressesQueue: " + progressesQueue);

            if(progressesQueue.peekFirst() >= 100) {
                // 1-1) 모두 더한 후, 가장 앞쪽의 값이 100 이상이면
                // 앞->뒤로 이동하며 100 이상이면 poll하고, poll할 때마다 deployed를 1씩 증가
                int deployed = 0;
                for(Integer p : progressesQueue) {
                    if(p >= 100) deployed++;
                    else break;
                }
                for(int i = 1; i <= deployed; i++) {
                    progressesQueue.pollFirst();
                    speedsQueue.pollFirst();
                }

                // 모두 poll했다면 deployed를 answerList에 추가
                answerList.add(deployed);
            } else {
                // 1-2) 모두 더한 후, 가장 앞쪽의 값이 100 이상이 아니면
                // 그냥 넘어감

            }

        }
        // -------- 반복문 끝

        System.out.println(answerList);

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;

    }
}