-- 코드를 입력하세요
SELECT f.FLAVOR from FIRST_HALF f inner join ICECREAM_INFO i on f.FLAVOR=i.FLAVOR where INGREDIENT_TYPE = 'fruit_based' and TOTAL_ORDER > 3000;