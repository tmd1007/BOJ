select HISTORY_ID, CAR_ID, SUBSTR(START_DATE,1,10), SUBSTR(END_DATE,1,10), if(datediff(end_date, start_date) >= 29, '장기 대여', '단기 대여') RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date like '2022-09%'
order by history_id desc;