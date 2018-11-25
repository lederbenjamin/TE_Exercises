-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

START TRANSACTION;

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (actor_id, first_name, last_name) VALUES
    (201, 'HAMPTON', 'AVENUE'),
    (202, 'LISA', 'BYWAY');
    
select * 
from actor;

DELETE FROM actor WHERE actor_id = 201;
DELETE FROM actor WHERE actor_id = 202;


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.

INSERT INTO film (film_id, title, description, release_year, language_id, length) VALUES
    (1001, 'EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

select * 
from film;

DELETE FROM film WHERE title = 'EUCLIDEAN PI';
    
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor (actor_id, film_id) VALUES
    (201, 1001),
    (202, 1001);
    
select film_id 
from film_actor
where actor_id = 202;

-- 4. Add Mathmagical to the category table.

INSERT INTO category (category_id, name) VALUES
    (17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

select *
from film
where title in ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE');

INSERT INTO film_category (film_id, category_id) VALUES
    (1001, 17),
    (274, 17),
    (494, 17),
    (714, 17),
    (996, 17);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

UPDATE film SET rating = 'G' WHERE film_id in (274, 494, 714, 996, 1001);

-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory (inventory_id, film_id, store_id) VALUES
    (4582, 1001, 1),
    (4583, 1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

DELETE FROM film WHERE title = 'EUCLIDEAN PI' ;
-- No. Deletion will not succeed because the film_id is being referenced by multiple other tables as a foreign key. 
-- Deletion would violate the referential integrity established by those tables' Constraint statements.
-- As such, Deletion will never succeed until those references have been deleted first. 


-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

DELETE FROM category WHERE name = 'Mathmagical';
-- No. Deletion will not succeed because the category_id is being referenced by the film_category table as a foreign key. 
-- Deletion would violate the referential integrity established by the film_category table's Constraint statement (foreign key constraint "film_category_category_id_fkey" on table "film_category")
-- As such, Deletion will never succeed until that reference have been deleted first. 

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

DELETE FROM film_category WHERE category_id = 17;
-- Yes, referential integrity was preserved as no other tables referenced the values in the film_category table. 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)


DELETE FROM category WHERE name = 'Mathmagical';
-- Yes, referential integrity was preserved as no other tables referenced the values in the 'Mathmagical' row of the category table. 

DELETE FROM film WHERE title = 'EUCLIDEAN PI';
-- No, referential integrity would be violated by a deletion as there are still other tables referencing the film_id as a foreign key.  


ROLLBACK;
-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

DELETE FROM film_actor WHERE actor_id = 201;
DELETE FROM film_actor WHERE actor_id = 202;
-- The 'film_actor' table must be adjusted to remove the two actor assocations
DELETE FROM inventory WHERE film_id = 1001;
-- the 'inventory' table must be adjusted to remove the two copies of "Euclidean PI"
DELETE FROM film WHERE title = 'EUCLIDEAN PI';
-- Now "Euclidean PI" can be deleted as it is no longer being referenced by any other tables. 
