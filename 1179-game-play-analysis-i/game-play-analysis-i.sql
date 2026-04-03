# Write your MySQL query statement below
select player_id,min(event_date) first_login
from activity
where event_date in(select min(event_date)
from activity
group by event_date
)
group by player_id;
