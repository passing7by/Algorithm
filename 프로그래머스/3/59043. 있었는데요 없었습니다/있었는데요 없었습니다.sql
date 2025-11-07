-- 코드를 입력하세요
-- 출력: 동물ID, 이름 (보호 시작일보다 입양일이 더 빠른 동물)
-- 정렬: 보호 시작일 오름차순
-- 문제
-- ANIMAL_INS의 DATETIME보다 ANIMAL_OUTS의 DATETIME이 더 빠른 동물을 찾아야 함
SELECT ai.ANIMAL_ID, ai.NAME
FROM ANIMAL_INS ai
JOIN ANIMAL_OUTS ao USING (ANIMAL_ID)
WHERE ao.DATETIME < ai.DATETIME
ORDER BY ai.DATETIME