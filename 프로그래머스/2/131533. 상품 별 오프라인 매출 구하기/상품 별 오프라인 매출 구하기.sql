-- 코드를 입력하세요
-- 출력결과: 상품코드, 상품코드별 매출액(판매가*판매량)
-- 정렬: 매출액 내림차순, 상품코드 오름차순
-- 상황: 한 상품ID는 하루에 하나의 매출 데이터만 있음
-- 문제
-- PRODUCT_ID별 SALES_AMOUNT의 합을 구해야 함
-- PRODUCT_ID별 SALES_AMOUNT의 합을 구했다면 그걸 PRICE와 곱해야 함
-- ㄴ> 이걸 하기 위해서 PRODUCT_ID별 PRICE와 JOIN해서 한 테이블을 만들자
-- 그리고 이걸 정렬해야 함
SELECT p.PRODUCT_CODE, SUM(os.SALES_AMOUNT) * p.PRICE AS SALES
FROM OFFLINE_SALE os
JOIN PRODUCT p USING (PRODUCT_ID)
GROUP BY os.PRODUCT_ID
ORDER BY SALES DESC, p.PRODUCT_CODE;
