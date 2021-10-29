package com.openapi.swagger.dto;

import com.openapi.swagger.mysql.Place;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper
//        (unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PlaceMapper {

    PlaceDTO map(Place place);
}
