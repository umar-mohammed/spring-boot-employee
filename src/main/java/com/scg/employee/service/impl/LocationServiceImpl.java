package com.scg.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employee.dao.LocationDAO;
import com.scg.employee.service.LocationService;
import com.scg.employee.vo.LocationVO;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDAO locationDAO;

	@Override
	public LocationVO saveLocation(final LocationVO locationVO) {
		return locationDAO.saveLocation(locationVO);
	}

	@Override
	public List<LocationVO> displayLocation() {
		return locationDAO.displayLocation();
	}

	@Override
	public LocationVO displayLocationById(final Integer id) {
		return locationDAO.displatLocationById(id);
	}

	@Override
	public String deleteLocation(final Integer id) {
		return locationDAO.deleteLocation(id);
	}

}
