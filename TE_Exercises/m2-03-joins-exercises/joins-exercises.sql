-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

select a.first_name, a.last_name, f.title
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on fa.film_id = f.film_id
where a.last_name = 'STALLONE';



-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select a.first_name, a.last_name, f.title
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on fa.film_id = f.film_id
where a.last_name = 'REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select a.first_name, a.last_name, f.title
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on fa.film_id = f.film_id
where a.first_name = 'JUDY' OR a.first_name = 'RIVER';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select f.title, c.name
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
where c.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

select f.title, c.name
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
where c.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select f.title, c.name
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
where c.name = 'Children' and f.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select f.title, c.name
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
where c.name = 'Family' and f.rating = 'G' and f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select a.first_name, a.last_name, f.title
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on fa.film_id = f.film_id
where a.last_name = 'LEIGH' and f.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

select f.title, c.name
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
where c.name = 'Sci-Fi' and f.release_year = '2006';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select a.first_name, a.last_name, f.title
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on fa.film_id = f.film_id
inner join film_category fc
on f.film_id = fc.film_id
inner join category c
on c.category_id = fc.category_id
where a.last_name = 'STALLONE' and c.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select a.address, c.city, a.district, co.country
from country co
inner join city c
on co.country_id = c.country_id
inner join address a
on c.city_id = a.city_id
inner join store s
on a.address_id = s.address_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select s.store_id, a.address, st.first_name, st.last_name
from address a
inner join store s
on a.address_id = s.address_id
inner join staff st
on s.store_id = st.store_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

select c.first_name, c.last_name, count(c.customer_id) as total
from customer c
inner join rental r
on c.customer_id = r.customer_id
group by c.first_name, c.last_name
order by total desc
limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

select c.first_name, c.last_name, sum(p.amount) as total
from customer c
inner join rental r
on c.customer_id = r.customer_id
inner join payment p
on r.rental_id = p.rental_id
group by c.first_name, c.last_name
order by total desc
limit 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select s.store_id, a.address, count(r.rental_id) as total_rentals, sum(p.amount) as total_sales, avg(p.amount) as avgsales
from address a
inner join store s
on a.address_id = s.address_id
inner join inventory i
on s.store_id = i.store_id
inner join rental r
on r.inventory_id = i.inventory_id
inner join payment p
on r.rental_id = p.rental_id
group by s.store_id, a.address_id


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

select f.title, count(r.inventory_id) as rentals
from film f
inner join inventory i 
on f.film_id = i.film_id
inner join rental r
on r.inventory_id = i.inventory_id
group by f.title
order by rentals desc
limit 10

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

select c.name, count(r.inventory_id) as rentals
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
inner join inventory i 
on f.film_id = i.film_id
inner join rental r
on r.inventory_id = i.inventory_id
group by c.name
order by rentals desc
limit 5



-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

select f.title, count(r.inventory_id) as rentals
from category c
inner join film_category fc
on c.category_id = fc.category_id
inner join film f
on f.film_id = fc.film_id
inner join inventory i 
on f.film_id = i.film_id
inner join rental r
on r.inventory_id = i.inventory_id
where c.name = 'Action'
group by f.title
order by rentals desc
limit 5

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

select a.first_name, a.last_name, count(r.inventory_id) as rentals
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on f.film_id = fa.film_id
inner join inventory i 
on f.film_id = i.film_id
inner join rental r
on r.inventory_id = i.inventory_id
group by a.first_name, a.last_name
order by rentals desc
limit 10

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

select a.first_name, a.last_name, count(r.inventory_id) as rentals
from actor a
inner join film_actor fa
on a.actor_id = fa.actor_id
inner join film f
on f.film_id = fa.film_id
inner join film_category fc
on f.film_id = fc.film_id
inner join category c
on c.category_id = fc.category_id
inner join inventory i 
on f.film_id = i.film_id
inner join rental r
on r.inventory_id = i.inventory_id
where c.name = 'Comedy'
group by a.first_name, a.last_name
order by rentals desc
limit 5


