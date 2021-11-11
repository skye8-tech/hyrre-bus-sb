package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.BusStopPointDto;
import com.skye8.elroykanye.hyrrebus.data.entity.BusStopPoint;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")

public interface BusStopPointMapper {
    BusStopPointDto mapBusStopPointToDto(BusStopPoint busStopPoint);

    @InheritInverseConfiguration
    @Mapping(target = "travelRouteBoard", ignore = true)
    @Mapping(target = "travelRouteDrop", ignore = true)
    @Mapping(target = "agency", ignore = true)
    BusStopPoint mapDtoToBusStopPoint(BusStopPointDto busStopPointDto);
}
