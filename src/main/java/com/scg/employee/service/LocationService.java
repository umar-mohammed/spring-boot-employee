package com.scg.employee.service;

import java.util.List;

import com.scg.employee.vo.LocationVO;

public interface LocationService {

	LocationVO saveLocation(LocationVO locationVO);

	List<LocationVO> displayLocation();

	LocationVO displayLocationById(Integer id);

	String deleteLocation(Integer id);
}
