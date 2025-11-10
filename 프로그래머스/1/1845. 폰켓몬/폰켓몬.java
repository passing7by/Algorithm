import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        // ---------- 문제 풀이 생각
        // 결국에는 nums에서 중복을 제거한 뒤에, 중복을 제거한 nums의 요소 갯수를 m이라고 하면,
        // n/2 > m 이면 m 반환
        // n/2 < m 이면 n/2 반환
        // 하는 문제 아닌가...?
        // ----------

        // ---------- 문제 풀이 시작
        // 0. 변수 선언
        Set<Integer> set = new HashSet<>();

        // 1. nums를 Set에 옮겨담아 중복 제거
        for (int i : nums) {
            set.add(i);
        }

        // 2. 반환
        // n/2 > m 이면 m 반환
        if(nums.length/2 >= set.size()) return set.size();
        // n/2 < m 이면 n/2 반환
        else return nums.length/2;
    }

}