class Solution {
    /*
    시간복잡도: O(NlogN)
    조건
    - 문자열에 1이 하나도 없는 경우는 존재하지 않음
     */

    public static int[] solution(String s) {

        int convertNum = 0;
        int totalCount = 0;
        while(true) {
            // 1. s의 모든 0을 제거하고 1만 남겼을 때의 문자열 길이를 구함
            int count = countOne(s);

            // 제거한 0의 갯수를 더함
            totalCount += s.length() - count;

            // 2. count를 이진법으로 표현한 문자열로 변환
            s = convertToBinary(count);

            // 이진 변환 횟수 카운트
            convertNum++;

            if("1".equals(s)) break;
        }

        return new int[]{convertNum, totalCount};
    }

    private static int countOne(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') count++;
        }

        return count;
    }

    private static String convertToBinary(int count) {
        String binary = "";
        // 숫자가 1이 될 때까지 아래 반복
        while(count > 1) {
            // 1. 숫자를 2로 나누고 나머지를 문자열의 맨 앞에 붙임
            binary = count % 2 + binary;
            // 2. 몫을 숫자로 함
            count = count / 2;
        }

        binary = "1" + binary;

        return binary;
    }
}