-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.sales) as TOTAL_SALES from book b join book_sales s on b.book_id=s.book_id where s.sales_date like '%2022-01%' group by b.CATEGORY  order by b.CATEGORY asc;