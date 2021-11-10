package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.AgencyDto;
import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import org.mapstruct.Mapper;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface AgencyMapper {

    AgencyDto mapAgencyToDto(Agency agency);
}
