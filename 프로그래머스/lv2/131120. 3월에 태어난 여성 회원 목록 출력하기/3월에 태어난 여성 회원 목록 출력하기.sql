select member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as DATE_OF_BIRTH
from member_profile
where date_format(date_of_birth, '%m') = '03' and tlno is not null and gender = 'W'
order by member_id;