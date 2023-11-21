-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.NAME
from ANIMAL_OUTS o 
join ANIMAL_INS i on o.animal_id=i.animal_id 
order by (o.DATETIME - i.DATETIME) desc limit 2;