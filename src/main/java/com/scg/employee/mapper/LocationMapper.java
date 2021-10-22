package com.scg.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employee.entity.Employee;
import com.scg.employee.entity.Location;
import com.scg.employee.vo.LocationVO;

@Mapper(componentModel = "spring", uses = { Employee.class })
public interface LocationMapper {

	LocationVO locationToVO(final Location location);

	Location voToLocation(LocationVO locationVO);

	List<LocationVO> locationListTOVOList(List<Location> location);

	List<Location> voListTOLocationList(List<LocationVO> locationVO);
}
