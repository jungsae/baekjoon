# -- 코드를 입력하세요
# SELECT p.product_code, (p.price * o.sales_amount) as sales
# FROM product p
# JOIN offline_sale o ON p.product_id = o.product_id
# ORDER BY p.PRODUCT_CODE;
SELECT p.PRODUCT_CODE, SUM(p.price * o.sales_amount) as SALES
FROM product p
inner JOIN offline_sale o ON p.product_id = o.product_id
GROUP BY p.product_code
ORDER BY SALES desc, p.product_code asc;