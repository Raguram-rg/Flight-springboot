package com.atos.flights.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.flights.entities.Flight;



@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
