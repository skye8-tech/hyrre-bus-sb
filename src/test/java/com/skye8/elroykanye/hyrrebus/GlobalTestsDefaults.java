package com.skye8.elroykanye.hyrrebus;

import com.skye8.elroykanye.hyrrebus.api.dto.AgencyAddressDto;
import com.skye8.elroykanye.hyrrebus.api.dto.AgencyDto;
import com.skye8.elroykanye.hyrrebus.api.dto.AgencyUserDto;
import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import com.skye8.elroykanye.hyrrebus.data.entity.AgencyAddress;
import com.skye8.elroykanye.hyrrebus.data.entity.AgencyUser;

public class GlobalTestsDefaults {
    public static final Agency DEFAULT_AGENCY = Agency.builder()
            .agencyId(1L).agencyName("My Agency")
            .build();

    public static final AgencyAddress DEFAULT_AGENCY_ADDRESS = AgencyAddress.builder()
            .street("Mile 25").town("Bamenda").region("NW").build();

    public static final AgencyDto DEFAULT_AGENCY_DTO = AgencyDto.builder()
            .agencyId(1L).agencyName("Some Agency").agencyAddressDto(AgencyAddressDto.builder()
                    .street("Some Street").town("Some Town").region("Some Region")
                    .build())
            .build() ;

    public static final AgencyUser DEFAULT_AGENCY_USER = AgencyUser.builder()
            .agencyUserId(1L).username("user").password("password").firstName("First").lastName("Last")
            .phoneNumber("1234567890")
            .build();

    public static final AgencyUserDto DEFAULT_AGENCY_USER_DTO = AgencyUserDto.builder()
            .agencyUserId(1L).username("user").firstName("First").lastName("Last").phoneNumber("1234567890")
            .build();
}
