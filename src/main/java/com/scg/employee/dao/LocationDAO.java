package com.scg.employee.dao;

import java.util.List;

import com.scg.employee.vo.LocationVO;

public interface LocationDAO {

	LocationVO saveLocation(LocationVO locationVO);

	List<LocationVO> displayLocation();

	LocationVO displatLocationById(Integer id);

	String deleteLocation(Integer id);

}
