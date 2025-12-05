-- 코드를 입력하세요
/*
두 개 테이블 조인해서 붙이고
출력 형식은 /home/grep/src/ + BOARD_ID + / + FILE_ID + FILE_NAME + FILE_EXT
조회 수가 가장 높은 중고거래 게시물의 BOARD_ID 필요
한 BOARD_ID당 여러 첨부파일 데이터 존재
*/
SELECT CONCAT('/home/grep/src/', board.BOARD_ID, '/', file.FILE_ID, file.FILE_NAME, file.FILE_EXT) AS FILE_EXT
FROM USED_GOODS_BOARD board
JOIN USED_GOODS_FILE file USING (BOARD_ID)
WHERE board.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY file.FILE_ID DESC
;
