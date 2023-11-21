# -- 코드를 입력하세요
# SELECT
#     hours.Num AS HOUR,
#     COALESCE(COUNT(DATE_FORMAT(o.DATETIME, '%H')), 0) AS COUNT
# FROM
#     (
#         SELECT 0 AS Num UNION 
#         SELECT 1 UNION 
#         SELECT 2 UNION 
#         SELECT 3 UNION 
#         SELECT 4 UNION 
#         SELECT 5 UNION 
#         SELECT 6 UNION 
#         SELECT 7 UNION 
#         SELECT 8 UNION 
#         SELECT 9 UNION 
#         SELECT 10 UNION 
#         SELECT 11 UNION 
#         SELECT 12 UNION 
#         SELECT 13 UNION 
#         SELECT 14 UNION 
#         SELECT 15 UNION 
#         SELECT 16 UNION 
#         SELECT 17 UNION 
#         SELECT 18 UNION 
#         SELECT 19 UNION 
#         SELECT 20 UNION 
#         SELECT 21 UNION 
#         SELECT 22 UNION 
#         SELECT 23
#     ) AS hours
# LEFT JOIN
#     animal_outs o ON hours.Num = HOUR(o.DATETIME)
# GROUP BY
#     hours.Num
# ORDER BY
#     hours.Num;
WITH recursive cte AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1 FROM cte WHERE HOUR <= 22
)

SELECT c.HOUR, COUNT(DATE_FORMAT(o.DATETIME, '%H')) AS COUNT
FROM cte c
LEFT JOIN ANIMAL_OUTS o ON c.HOUR = DATE_FORMAT(o.DATETIME, '%H')
GROUP BY c.HOUR;
