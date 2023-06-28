select substr(product_code, 1, 2) as sub, count(product_code)
from product
group by sub
order by sub;