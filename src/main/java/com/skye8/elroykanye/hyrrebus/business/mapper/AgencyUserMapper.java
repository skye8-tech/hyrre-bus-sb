package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.AgencyUserDto;
import com.skye8.elroykanye.hyrrebus.data.entity.AgencyUser;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author  Elroy Kanye
 * created on: 06-11-21
 *
 * modified by Tanju Brunostar
 * modified on: 11-11-21
 */

@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")

public interface AgencyUserMapper {
    AgencyUserDto mapAgencyUserToDto (AgencyUser agencyUser);

    @InheritInverseConfiguration
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "agency", ignore = true)
    AgencyUser mapDtoToAgencyUser(AgencyUserDto agencyUserDto);
}
