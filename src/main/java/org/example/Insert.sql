select passenger_name from Passenger; --1
select company_name from Company; --2
select * from Trip
where town_from = 'Moscow'; --3
select * from Passenger
where passenger_name like '%man'; --4
select count(*) from Trip
where plane like 'TU-134'; --5
select company_name, Trip.id, Trip.plane from Company
join Trip on Company.id = Trip.company_idwhere plane like 'Boeing'; --6
select plane from Trip
where town_to like 'Moscow'; --7
select company_name,Trip.town_to from Company
                                          join Trip on Company.id = Trip.company_idwhere town_to like 'Vladivostok'; --9
select Passenger.id , Passenger.passenger_name from Passenger; --12
select town_to from Trip
                        join Pass_in_trip on Trip.id = Pass_in_trip.trip_idwhere passenger_id = 1; -- 14
select Passenger.passenger_name,town_to from Trip
                                                 join Pass_in_trip on Trip.id = trip_idjoin Passenger on Pass_in_trip.passenger_id = Passenger.idwhere Trip.town_to like 'London'; --15
select count(*) from Trip
where town_from = 'Rostov' and town_to = 'Moscow';--16
select town_to,town_from, Company.company_name from Trip
                                                        join Company on Trip.company_id = Company.idwhere town_from = 'Rostov' and town_to = 'Moscow';select passenger_name from Passenger
                                                                                                                                                      order by length(passenger_name) desc limit 1; --17
select count(passenger_name),passenger_name from Passenger
group by passenger_nameHAVING count(*) > 1; --18
select; --19
select count(passenger_id) as cnt, Pass_in_trip.passenger_id, Passenger.passenger_name from Pass_in_trip--20
                                                                                                join Passenger on Pass_in_trip.passenger_id = Passenger.idgroup by Pass_in_trip.passenger_id,Passenger.passenger_nameHAVING count(*) > 1order by cnt desc ;
delete from Trip
where town_from like 'Moscow'; --21