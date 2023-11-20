-- 코드를 입력하세요
SELECT (select left(p.PRODUCT_CODE, 2)) as CATEGORY, COUNT(p.PRODUCT_ID) as PRODUCTS from PRODUCT p Group by CATEGORY order by CATEGORY asc;