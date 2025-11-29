import java.util.Arrays;

class Solution {
    /*
    시간복잡도: O(N^2)
    조건
    - 문자열은 소문자 알파벳으로만 이루어져 있음
    - n이 문자열 길이보다 크거나 같은 경우는 없음
    - n번째 문자가 같은 경우, 같은 것끼리는 사전 순으로 정렬
     */

    public String[] solution(String[] strings, int n) {
        // 사전순 정렬
        Arrays.sort(strings);
        
        // n번째 문자가 다른 경우에만 n번째 문자 기준 정렬, 같은 경우 기존 정렬 순서(사전순) 유지
        Arrays.sort(strings, (o1, o2) -> {
           return o1.charAt(n) != o2.charAt(n) ? o1.charAt(n) - o2.charAt(n) : 0;
        });

        return strings;
    }
}