-- 코드를 작성해주세요
/*
문제 분석
- 어떤 아이템의 ID를 부모ID라고 놓았을 때, 조회되는 ITEM_TREE가 없다면 더이상 업그레이드 불가능

*/
SELECT info.ITEM_ID, info.ITEM_NAME, info.RARITY
FROM ITEM_INFO info
LEFT JOIN ITEM_TREE tree ON info.ITEM_ID = tree.PARENT_ITEM_ID
WHERE tree.ITEM_ID IS NULL
ORDER BY info.ITEM_ID DESC
;