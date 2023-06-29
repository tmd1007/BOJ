select MCDP_CD, count(MCDP_CD) as cnt
from appointment
where APNT_YMD like '2022-05%'
group by MCDP_CD
order by cnt, MCDP_CD;