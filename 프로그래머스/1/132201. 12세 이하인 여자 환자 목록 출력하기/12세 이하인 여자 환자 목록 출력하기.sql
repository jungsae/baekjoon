-- 코드를 입력하세요
SELECT PT_NAME,PT_NO,GEND_CD,AGE, IF(TLNO is null, 'NONE', TLNO) as TLNO from PATIENT where AGE <=12 and gend_cd='W' order by age desc, PT_NAME asc;