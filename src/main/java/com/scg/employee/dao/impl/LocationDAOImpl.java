package com.scg.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employee.dao.LocationDAO;
import com.scg.employee.entity.Location;
import com.scg.employee.mapper.LocationMapper;
import com.scg.employee.repository.LocationRepository;
import com.scg.employee.vo.LocationVO;

@Component
public class LocationDAOImpl implements LocationDAO {

	@Autowired
	private LocationMapper locationMapper;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public LocationVO saveLocation(final LocationVO locationVO) {
		final Location location = locationMapper.voToLocation(locationVO);
		return locationMapper.locationToVO(locationRepository.save(location));

	}

	@Override
	public List<LocationVO> displayLocation() {
		return locationMapper.locationListTOVOList(locationRepository.findAll());
	}

	@Override
	public LocationVO displatLocationById(final Integer id) {
		return locationMapper.locationToVO(locationRepository.findById(id).orElse(null));
	}

	@Override
	public String deleteLocation(final Integer id) {
		locationRepository.deleteById(id);
		return "location with id : " + id + "deleted";
	}

}
