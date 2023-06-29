select floor(price/10000) * 10000, count(floor(price/10000))
from product
group by floor(price/10000)
order by floor(price/10000);