/*
제약사항
- 곱할 수 있는 배열만 주어짐(arr1의 열의 갯수 = arr2의 행의 갯수)

시간복잡도: O(N^2) 이내
- 행렬 하나의 최대 크기는 100 * 100 = 10000
*/
class Solution {
    // ----------- 풀이 생각
    // result[n][m]
    // = arr1의 n행의 각 원소를 arr2의 m열의 각 원소와 곱한 다음 모두 더한 것
    // -----------

    // arr1과 arr2를 입력받음
    // 새 배열 result[arr1.lenth][arr2[0].length] 선언
    // k = arr1의 열의 갯수
    // i = 0 ~ k 일 때 j = 0 ~ k 인 경우에 대해 아래 반복
    // arr1의 i행의 각 원소를 arr2의 j열의 각 원소와 곱한 다음 모두 더한 값을 result에 저장
    // result 반환

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        // 새 배열 result[arr1.lenth][arr2[0].length] 선언
        int[][] result = new int[arr1.length][arr2[0].length];


        // arr1의 i행의 각 원소를 arr2의 j열의 각 원소와 곱한 다음 모두 더한 값을 result[i][j]에 저장
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int tempSum = 0;
                for(int k = 0; k < arr1[0].length; k++) {
                    tempSum += (arr1[i][k] * arr2[k][j]);
                }
                result[i][j] = tempSum;
            }
        }

        return result;
    }
}