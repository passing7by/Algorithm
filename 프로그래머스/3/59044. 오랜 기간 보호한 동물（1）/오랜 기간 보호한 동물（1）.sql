-- 코드를 입력하세요
/*
출력: 동물 이름, 보호 시작일
조건: 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물
정렬: 보호 시작일 오름차순
제한: 3마리만 조회
문제
- 입양을 못 간 동물 조회
- 보호 시작일 오름차순 정렬
*/
SELECT ai.NAME, ai.DATETIME
FROM ANIMAL_INS ai
LEFT JOIN ANIMAL_OUTS ao ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ao.ANIMAL_ID IS NULL
ORDER BY ai.DATETIME ASC
LIMIT 3;