# -- 코드를 입력하세요
SELECT o.USER_ID, o.PRODUCT_ID from ONLINE_SALE o 
group by o.product_id, o.user_id
having count(*) >1
order by o.USER_ID, o.PRODUCT_ID desc;