-- 코드를 입력하세요
/*
중고 거래 게시물 3건 이상 등록한 사용자:
사용자ID별로 COUNT(*) 를 조회했을 때, 조회 결과가 3 이상
전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입:
문자열 형식 지정
*/
SELECT board.WRITER_ID, 
    user.NICKNAME, 
    CONCAT_WS(' ', user.CITY, user.STREET_ADDRESS1, user.STREET_ADDRESS2),
    CONCAT_WS('-', LEFT(user.TLNO, 3), SUBSTRING(user.TLNO, 4, 4), RIGHT(user.TLNO, 4))
FROM USED_GOODS_BOARD board
JOIN USED_GOODS_USER user ON board.WRITER_ID = user.USER_ID
GROUP BY board.WRITER_ID
HAVING COUNT(*) >= 3
ORDER BY board.WRITER_ID DESC