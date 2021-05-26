package com.atos.flights.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.flights.entities.Flight;
import com.atos.flights.repositories.FlightRepository;

@Service
public class FlightService {
	
    @Autowired
	FlightRepository repos;
    
    public List<Flight> getAllFlights(){
    	return repos.findAll();
    }
 
}
