-- 코드를 입력하세요
SELECT a.MCDP_CD as 진료과코드, count( a.PT_NO) as 5월예약건수 from APPOINTMENT a where APNT_YMD like '%2022-05%' group by 진료과코드 order by 5월예약건수 asc, a.MCDP_CD asc;