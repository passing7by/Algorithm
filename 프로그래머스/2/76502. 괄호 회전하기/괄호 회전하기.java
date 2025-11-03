import java.util.*;

class Solution {
        public int solution(String s) {

        // ======================= 어떻게 풀지 생각
        // 왼쪽으로 회전시킨다 = 맨앞글자를 맨뒤로 옮긴다
        // 처음 상태도 '한 번 회전한 상태'에 해당됨
        // 맨앞글자를 맨뒤로 옮겨서 확인하는걸 '글자수 - 1'번 해야겠네
        // 맨앞글자를 맨뒤로 옮기는 걸 ArrayList로 해?
        // ㄴ 근데 그러면 맨앞글자를 맨뒤로 보낸다음 모든 글자를 앞으로 한 칸씩 옮겨야 하잖아..
        //    글자수가 많아질수록 글자 옮기는 일(부차적인 일;)이 많아지겠지..
        // StringBuilder 써볼까?
        // 덱 아님 큐 쓰면 될거같은데?

        // 올바른 괄호 문자열인지는 어떻게 검사하지....
        // 여는 괄호는 stack에 쌓아 둠
        // 닫는 괄호가 들어왔을 때 stack의 최상단에 있는 괄호와 짝이 맞으면
        // -> 최상단 요소 pop, 다음 진행
        // 닫는 괄호가 들어왔을 때 stack이 비어있거나 최상단에 있는 괄호와 짝이 맞지 않으면
        // -> 바로 옳지 않은 괄호로 판단하고 다음 진행하지 않음

        // 올바른 문자열일 때마다 answer을 1씩 증가시킴

        // ======================= 풀이
        // 0. 초기 변수 선언
        // 0-1) 덱 생성
        Queue<Character> brackets = new ArrayDeque<>();
        // 0-2) 검사 횟수를 저장할 변수 생성
        int count = 0;
        int answer = 0;

        // 1. String s 를 char[]로 변환한 후, 요소를 하나씩 덱에 넣음(큐 형식으로)
        for (char c : s.toCharArray()) {
            brackets.offer(c);
        }
        // 덱에 잘 넣어졌는지 확인
        System.out.println("brackets: " + brackets);

        while (count < brackets.size()) {
            // 덱에서 맨 앞 요소를 맨 뒤로 이동 (단, count == 0이면 이동시키지 않음)
            if (count != 0) {
                Character c = brackets.poll();
                brackets.offer(c);
            }

            // 2. 올바른 문자열인지 검사
            // 2-1) 변수 선언
            // 열린 괄호를 쌓아 둘 Stack 생성
            Deque<Character> openedBrackets = new ArrayDeque<>();

            // 올바른 괄호 문자열인지 저장
            Boolean isCorrect = true;

            // 2-2) 덱에서 앞->뒤 순서로 검사해봄

            // -- 반복문 시작
            for (Character c : brackets) {
                // 여는 괄호는 stack에 쌓아 둠
                if(c == '(' || c == '{' || c == '[') openedBrackets.push(c);
                // 닫는 괄호가 들어왔을 때 stack의 최상단에 있는 괄호와 짝이 맞으면
                // -> 최상단 요소 pop, 다음 진행
                // (NPE를 피하기 위해 stack이 비어있지 않은 경우에만 검사)
                else if(!openedBrackets.isEmpty()) {
                    if(c == ')' && openedBrackets.peek() == '(') openedBrackets.pop();
                    else if(c == '}' && openedBrackets.peek() == '{') openedBrackets.pop();
                    else if(c == ']' && openedBrackets.peek() == '[') openedBrackets.pop();
                    else {
                        // 닫는 괄호가 들어왔을 때  최상단에 있는 괄호와 짝이 맞지 않으면
                        // -> 바로 옳지 않은 괄호로 판단하고 다음 진행하지 않음
                        isCorrect = false;
                        break;
                    }
                } else {
                    // 닫는 괄호가 들어왔을 때 stack이 비어있으면
                    // -> 바로 옳지 않은 괄호로 판단하고 다음 진행하지 않음
                    isCorrect = false;
                    break;
                }
            }
            // -- 반복문 끝

            // 3. 올바른 문자열이라면 answer 증가
             if(isCorrect && openedBrackets.isEmpty()) answer++;

            // 4. 검사 횟수 증가
             count++;
        }

        return answer;

    }

}