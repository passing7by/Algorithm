import java.util.HashSet;
import java.util.Set;

/*
A가 B의 접두어 = A가 B에 포함되며 맨 앞에 있음

시간복잡도: O(logN) 이내

중복되는 전화번호는 없음

방법1: 길이순으로 정렬하고, 앞부터 검사하며 다른 모두와 접두어인지 확인 -> 시간초과
방법2: 전화번호를 키, 길이를 값으로 하여 값이 더 큰 키들에 대해 해당 키를 포함하는지 검사 -> 시간초과
방법3: 특정 전화번호의 접두어 후보를 모두 해시셋에서 검색
*/
class Solution {
    private static boolean hasPrefix(String s, Set<String> set) {
        boolean result = true;

        // 1. 요소의 접두어가 될 수 있는 모든 문자열에 대해 해시셋에 존재하는지 확인
        // 2. 존재하면 false를 리턴하고 메서드 종료
        for(int i = 1; i < s.length(); i++) {
            String prefix = s.substring(0, i);
            if(set.contains(prefix)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public boolean solution(String[] phone_book) {
        // 1. 해시셋 생성
        // 2. 배열의 문자열을 하나씩 꺼내어 해시셋에 저장
        // 3. 해시셋의 요소를 하나씩 꺼냄
            // 3-1. 요소의 접두어가 될 수 있는 모든 문자열에 대해 해시셋에 존재하는지 확인
                // 3-1-1. 존재하면 false를 리턴하고 메서드 종료

        // 1. 해시셋 생성
        Set<String> set = new HashSet<>();

        // 2. 배열의 문자열을 하나씩 꺼내어 해시셋에 저장
        for(String s : phone_book) {
            set.add(s);
        }

        // 3. 해시셋의 요소를 하나씩 꺼냄
        boolean answer = true;

        for(String s : set) {
            // 3-1. 요소의 접두어가 될 수 있는 모든 문자열에 대해 해시셋에 존재하는지 확인
            // 3-1-1. 존재하면 false를 리턴하고 메서드 종료
            if(!hasPrefix(s, set)) {
                answer = false;
                break;
            }

        }
        return answer;
    }
}


