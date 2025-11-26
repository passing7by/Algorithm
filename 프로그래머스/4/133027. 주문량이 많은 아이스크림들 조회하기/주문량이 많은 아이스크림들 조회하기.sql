-- 코드를 입력하세요
/*
문제
- 맛 별로 7월 총 주문량과 상반기 총 주문량을 더한 값을 구해야 함
- 위에서 구한 값에서 상위 3개 추출하여 출력
주의
7월에는 같은 맛의 아이스크림이라도 서로 다른 두 공장에서 출하하는 경우가 있음
ㄴ 같은 아이스크림에 대해 여러 데이터 행이 있을 수 있음
*/
# SELECT fh.FLAVOR
# FROM FIRST_HALF fh
# JOIN JULY j USING (FLAVOR)
# ORDER BY fh.TOTAL_ORDER + j.TOTAL_ORDER DESC
# LIMIT 3;
WITH a AS(
    SELECT FLAVOR, SHIPMENT_ID, TOTAL_ORDER
    FROM FIRST_HALF
    UNION ALL
    SELECT FLAVOR, SHIPMENT_ID, TOTAL_ORDER
    FROM JULY
)
SELECT FLAVOR
FROM a
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 3
;