package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.TravelScheduleDto;
import com.skye8.elroykanye.hyrrebus.data.entity.TravelSchedule;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @author  Elroy Kanye
 * created on: 06-11-21
 * modified by godsakani
 * modified on:11-11-21
 */

@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface TravelScheduleMapper {
    TravelScheduleDto mapTravelScheduleToDto(TravelSchedule travelSchedule);

    @InheritInverseConfiguration
    TravelSchedule mapDtoToTravelSchedule(TravelScheduleDto travelScheduleDto);
}
