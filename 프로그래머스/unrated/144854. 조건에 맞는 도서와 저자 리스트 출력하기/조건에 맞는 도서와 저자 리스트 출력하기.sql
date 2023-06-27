select b.book_id 도서ID, a.author_name 저자명, substr(b.published_date, 1, 10) 출판일
from book b
inner join author a
on b.author_id = a.author_id
where b.category = '경제'
order by 출판일 asc;