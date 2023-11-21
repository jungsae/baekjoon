-- 코드를 입력하세요
# select (HOUR(DATETIME)) as HOUR ,count(DATE_FORMAT(DATETIME,'%H')) as COUNT from animal_outs group by Hour order by hour;
SELECT
    hours.Number AS HOUR,
    COALESCE(COUNT(DATE_FORMAT(o.DATETIME, '%H')), 0) AS COUNT
FROM
    (
        SELECT 0 AS Number UNION ALL
        SELECT 1 UNION ALL
        SELECT 2 UNION ALL
        SELECT 3 UNION ALL
        SELECT 4 UNION ALL
        SELECT 5 UNION ALL
        SELECT 6 UNION ALL
        SELECT 7 UNION ALL
        SELECT 8 UNION ALL
        SELECT 9 UNION ALL
        SELECT 10 UNION ALL
        SELECT 11 UNION ALL
        SELECT 12 UNION ALL
        SELECT 13 UNION ALL
        SELECT 14 UNION ALL
        SELECT 15 UNION ALL
        SELECT 16 UNION ALL
        SELECT 17 UNION ALL
        SELECT 18 UNION ALL
        SELECT 19 UNION ALL
        SELECT 20 UNION ALL
        SELECT 21 UNION ALL
        SELECT 22 UNION ALL
        SELECT 23
    ) AS hours
LEFT JOIN
    animal_outs o ON hours.Number = HOUR(o.DATETIME)
GROUP BY
    hours.Number
ORDER BY
    hours.Number;

