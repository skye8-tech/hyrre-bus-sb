package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.BusDto;
import com.skye8.elroykanye.hyrrebus.data.entity.Bus;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 * Modified by godsakani
 * modified on: 11-11-2021
 */


@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface BusMapper {
    BusDto mapBusToDto(Bus bus);

    @InheritInverseConfiguration
    @Mapping(target = "BusType", ignore = true)
    Bus mapDtoToBus(BusDto busDto);
}
