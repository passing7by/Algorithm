public class Solution {
    boolean solution(String s) {
        boolean answer = false;

        // 1. 변수 openCnt 생성
        int openCnt = 0;

        // 2. 문자열의 문자를 맨 앞부터 확인
        for(char c : s.toCharArray()) {
            // 2-1. ( 이면 + 1, ) 이면 - 1
            if(c == '(') openCnt++;
            else openCnt--;
            // 2-2. openCnt < 0 면 false return
            if(openCnt < 0) break;
        }
        // 3. openCnt > 0 false, 0 이면 true return
        if(openCnt == 0) answer = true;

        return answer;
    }
}