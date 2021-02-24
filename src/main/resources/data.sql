DROP TABLE airport;
DROP TABLE region;
DROP TABLE country;
CREATE TABLE airport (id int, type varchar, name varchar,  latitude_deg varchar,  longitude_deg varchar, elevation_ft varchar, continent varchar, iso_country varchar, iso_region varchar, municipality varchar, scheduled_service varchar, gps_code varchar, iata_code varchar, local_code varchar, wizzair varchar, ryanair varchar, airbaltic varchar, lufthansa varchar, turkishairlines varchar )
    AS SELECT * FROM CSVREAD('./src\main\resources\task_airports.csv', null, 'charset=UTF-8','fieldSeparator=,');
CREATE TABLE region (id int, code varchar, name varchar,  continent varchar,  iso_country varchar )
    AS SELECT * FROM CSVREAD('./src\main\resources\task_regions.csv', null, 'charset=UTF-8','fieldSeparator=,');
CREATE TABLE country (code varchar, name varchar,  continent varchar)
    AS SELECT * FROM CSVREAD('./src\main\resources\task_countries.csv', null, 'charset=UTF-8','fieldSeparator=,');
