package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.TravelTicketDto;
import com.skye8.elroykanye.hyrrebus.data.entity.TravelTicket;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 * modified by Nfon Andrew
 * modified on: 11-11-21
 */

@Mapper (componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface TravelTicketMapper {
    TravelTicketDto mapTravelTicketToDto (TravelTicket travelTicket);

    @Mapping(target="travelSchedule", ignore = true)
    TravelTicket mapDtoToTravelTicket (TravelTicketDto travelTicketDto);


}
