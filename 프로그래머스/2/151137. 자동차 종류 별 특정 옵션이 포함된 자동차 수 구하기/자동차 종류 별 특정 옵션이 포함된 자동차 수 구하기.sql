-- 코드를 입력하세요
SELECT c.CAR_TYPE, count(*) as CARS from CAR_RENTAL_COMPANY_CAR c WHERE OPTIONS REGEXP '통풍시트|열선시트|가죽시트' group by CAR_TYPE order by CAR_TYPE asc;