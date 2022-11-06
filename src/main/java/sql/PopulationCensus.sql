select sum(city.population)
from city inner join country
on city.CountryCode = country.code
where country.continent = 'Asia';