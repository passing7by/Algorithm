-- 코드를 입력하세요
-- 출력: ID, 이름 (입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는 동물의)
-- 정렬: ID 오름차순
-- 문제
-- ANIMAL_OUTS에는 ANIMAL_ID가 있고, ANIMAL_INS에는 ANIMAL_ID가 없는 동물을 찾아야 함
SELECT ao.ANIMAL_ID, ao.NAME
FROM ANIMAL_OUTS ao
LEFT JOIN ANIMAL_INS ai USING (ANIMAL_ID)
WHERE ai.ANIMAL_ID IS NULL;