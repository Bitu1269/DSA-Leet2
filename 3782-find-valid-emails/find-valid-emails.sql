# Write your MySQL query statement below
select * from Users
where email Regexp '^[a-z0-9_]+@[^@0-9]+\\.com$'
order by user_id;
