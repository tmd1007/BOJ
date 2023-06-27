select p.product_code code, sum(p.price * off.sales_amount) sales
from product p
inner join offline_sale off
on p.product_id = off.product_id
group by p.product_id
order by sales desc, code;