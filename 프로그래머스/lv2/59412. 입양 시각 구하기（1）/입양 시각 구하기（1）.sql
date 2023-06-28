select if(date_format(datetime, '%H') like '0%', 
          replace(date_format(datetime, '%H'), '0', ''), date_format(datetime, '%H')) as h, count(datetime)
from animal_outs
where date_format(datetime, '%H') between 9 and 19
group by h
order by date_format(datetime, '%H');