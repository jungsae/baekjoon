SELECT 
    c.HISTORY_ID, 
    c.CAR_ID, 
    DATE_FORMAT(c.start_date, '%Y-%m-%d') AS START_DATE, 
    DATE_FORMAT(c.end_date, '%Y-%m-%d') AS END_DATE,
    IF(DATEDIFF(c.end_date, c.start_date) >= 29, '장기 대여', '단기 대여') AS RENT_TYPE
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY c
where c.start_date like '%2022-09%'
order by history_id desc;