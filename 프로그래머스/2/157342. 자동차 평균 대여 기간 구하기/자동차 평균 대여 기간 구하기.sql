
SELECT
    c.CAR_ID,
    ROUND(AVG(DATEDIFF(END_DATE,START_DATE)+1),1) AS AVERAGE_DURATION
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY c
GROUP BY
    c.CAR_ID
Having AVERAGE_DURATION >= 7
ORDER BY
    AVERAGE_DURATION DESC, c.CAR_ID DESC;
