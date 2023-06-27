select book_id, substr(published_date,1,10)
from book
where published_date like '2021%' and category = '인문'
order by published_date;