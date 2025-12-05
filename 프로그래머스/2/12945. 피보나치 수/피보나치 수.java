class Solution {
/*
시간복잡도: O(NlogN) 이내
 */

    public static int solution(int n) {
        /* -------- 풀이 생각
        점화식: F(n) = F(n-1) + F(n-2)
        종료 조건: n = 2
        F(2) = F(1) + F(0) 이고 F(1) = 1, F(0) = 0 임을 알고 있기 때문
         */
        int[] fibodata = new int[n + 1];
        fibodata[1] = 1;
        fibodata[2] = 1;

        for(int i = 3; i < fibodata.length; i++) {
            fibodata[i] = (fibodata[i - 2] + fibodata[i - 1]) % 1234567;
        }

        return fibodata[n];
    }
}