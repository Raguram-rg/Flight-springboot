package com.atos.flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.flights.entities.Flight;
import com.atos.flights.service.FlightService;


@RestController
@CrossOrigin(origins = "*")
public class FlightController {
	
	@Autowired  
	private FlightService service;
	
	@RequestMapping(value = "/flights", produces = "application/json",method = RequestMethod.GET)
	public List<Flight> getFlights(){
		return  service.getAllFlights();
	}

}
