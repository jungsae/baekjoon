-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER,DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH 
from MEMBER_PROFILE
where DATE_OF_BIRTH like '%____-03%' and gender='W' and TLNO is not null order by MEMBER_ID asc;