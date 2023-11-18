select p.product_code, SUM(p.price * o.SALES_AMOUNT) as SALES from product p 
inner join OFFLINE_SALE o 
    on p.product_id = o.product_id  
group by p.product_code
order by SALES desc,p.product_code asc;