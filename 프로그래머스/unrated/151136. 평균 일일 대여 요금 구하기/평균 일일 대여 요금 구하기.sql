select round(sum(daily_fee) / count(*)) AVERAGE_FEE
from car_rental_company_car
where car_type = 'SUV';