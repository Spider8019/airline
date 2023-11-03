package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.airline.web.entities.Airplane;
import in.airline.web.services.AirplaneService;

@Controller
public class AirplaneController{
	
	@Autowired
	private AirplaneService airplaneService;
	
	@GetMapping("/getAAirplane")
	public Airplane getAAirplane(String modelNumber) {
		return this.airplaneService.getAAirplane(modelNumber);
	}
	@GetMapping("/getAllAirplanes")
	public List<Airplane> getAllAirplanes(){
		return this.airplaneService.getAllAirplanes();
	}
	
}