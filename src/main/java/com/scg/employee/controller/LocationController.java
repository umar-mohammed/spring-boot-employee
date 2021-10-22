package com.scg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employee.service.LocationService;
import com.scg.employee.vo.LocationVO;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@PostMapping()
	public LocationVO save(@RequestBody final LocationVO locationVO) {
		return locationService.saveLocation(locationVO);
	}

	@GetMapping()
	public List<LocationVO> display() {
		return locationService.displayLocation();
	}

	@GetMapping("/{id}")
	public LocationVO displayById(@PathVariable final Integer id) {
		return locationService.displayLocationById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable final Integer id) {
		return locationService.deleteLocation(id);
	}

}
