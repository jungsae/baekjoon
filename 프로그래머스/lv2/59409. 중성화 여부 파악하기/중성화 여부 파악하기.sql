-- 코드를 입력하세요
SELECT a.animal_id, a.name, IF(SEX_UPON_INTAKE LIKE 'Intact%', 'X', 'O') from animal_ins a order by a.animal_id