-- 코드를 입력하세요
SELECT o.animal_id, o.name from ANIMAL_OUTS o left join ANIMAL_INS a on a.animal_id=o.animal_id where o.DATETIME < a.DATETIME order by a.datetime