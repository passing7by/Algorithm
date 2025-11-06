import java.util.HashMap;
import java.util.Map;

class Solution {
        public String solution(String[] participant, String[] completion) {
        // 제약: N은 최대 100,000 => O(N^2)불가, O(N)이하여야 함
        // 주의: 참가자 중에는 동명이인이 있음

        // ------------ 풀이 생각
        // 이름만으로 완주했는지 아닌지 판단?
        // ㄴ> 불가. 동명이인이 있기 때문.
        // 그럼 뭘로 판단?
        // ㄴ> 이름으로 판단하되, 몇 명이 있는지에 대한 정보를 추가적으로 저장하고,
        //     완주 명단에 그 수만큼 이름이 등장했는지 검사
        // 풀이 순서
        // 1. map 생성: 키(이름)-값(등장횟수)
        // (이 맵은 participant, completion 각각에 대해 생성)
        // 2. 특정 키에 대해 participant map의 값과 completion map의 값이 같다면 -> 해당 이름을 가진 사람들은 완주한 것
        //    다르다면 -> 해당 이름을 가진 사람들 중 한 명은 완주하지 못했으므로 이름 출력
        // ------------

        // ------------ 풀이 시작
        // 1. participant map, completion map을 만듦: 키(이름)-값(등장횟수)
        // 1-1) participant map 생성
        // map 변수 선언
        Map<String, Integer> pMap = new HashMap<>();
        for (String p : participant) {
            // p가 map에 없다면 map.put(p, 1)
            if(!pMap.containsKey(p)) pMap.put(p, 1); 
            // p가 map에 있다면 map.put(p, map.get(p) + 1)
            else pMap.put(p, pMap.get(p) + 1);
        }
        // 1-2) completion map 생성
        // map 변수 선언
        Map<String, Integer> cMap = new HashMap<>();
        for (String c : completion) {
            // c가 map에 없다면 map.put(c, 1)
            if(!cMap.containsKey(c)) cMap.put(c, 1);
            // c가 map에 있다면 map.put(c, map.get(c) + 1)
            else cMap.put(c, cMap.get(c) + 1);
        }

        // 2. participant map의 특정 키에 대해 participant map의 값과 completion map의 값을 검사
        String answer = "";
        for (String name : pMap.keySet()) {
            // 2-1) name에 대한 participant map, completion map의 값을 비교
            // 다르다면 answer = name 하고 break;
            if(!pMap.get(name).equals(cMap.get(name))){
            // value가 Integer로 null일 수 있으므로, NPE를 피하기 위해 equals()로 비교
                answer = name;
                break;
            }
        }
        // ------------

        return answer;
    }

}