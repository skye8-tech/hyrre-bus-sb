package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.AgencyDto;
import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 *
 * Modified by: Elroy Kanye
 * Modified on: 11/11/21
 */
@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface AgencyMapper {
    AgencyDto mapAgencyToDto(Agency agency);

    @InheritInverseConfiguration
    @Mapping(target = "agencyAddress", ignore = true)
    @Mapping(target = "buses", ignore = true)
    @Mapping(target = "busStopPoints", ignore = true)
    @Mapping(target = "agencyUser", ignore = true)
    Agency mapDtoToAgency(AgencyDto agencyDto);
}
