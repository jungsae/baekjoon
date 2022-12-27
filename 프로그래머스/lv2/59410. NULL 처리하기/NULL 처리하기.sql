-- 코드를 입력하세요
SELECT a.animal_type, IFNULL(name, "No name"), a.sex_upon_intake from animal_ins a order by a.animal_id