-- 코드를 작성해주세요
SELECT next_info.ITEM_ID, next_info.ITEM_NAME, next_info.RARITY
FROM ITEM_INFO info
JOIN ITEM_TREE tree ON tree.PARENT_ITEM_ID = info.ITEM_ID
JOIN ITEM_INFO next_info ON tree.ITEM_ID = next_info.ITEM_ID
WHERE info.RARITY = 'RARE'
ORDER BY next_info.ITEM_ID DESC
;