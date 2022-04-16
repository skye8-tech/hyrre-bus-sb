package com.skye8.elroykanye.hyrrebus.business.mapper;

import com.skye8.elroykanye.hyrrebus.api.dto.AgencyAddressDto;
import com.skye8.elroykanye.hyrrebus.api.dto.AgencyDto;
import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import com.skye8.elroykanye.hyrrebus.data.entity.AgencyAddress;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AgencyMapperTest {
    private final AgencyMapper agencyMapper;

    @Autowired
    public AgencyMapperTest(AgencyMapper agencyMapper) {
        this.agencyMapper = agencyMapper;
    }

    Agency agency = new Agency();
    AgencyAddress agencyAddress = new AgencyAddress();
    AgencyDto agencyDto = new AgencyDto();

    @BeforeEach
    public void setUp() {
        agencyAddress = AgencyAddress.builder()
                .street("Mile 25").town("Bamenda").region("NW").build();
        agency = Agency.builder()
                .agencyId(1L)
                .agencyName("My Agency")
                .agencyAddress(agencyAddress)
                .build();
        agencyAddress.setAgency(agency);

        agencyDto = AgencyDto.builder()
                .agencyId(1L)
                .agencyName("Some Agency")
                .agencyAddressDto(AgencyAddressDto.builder()
                        .street("Some Street").town("Some Town").region("Some Region")
                        .build())
                .build();

    }

    @Test
    void mapAgencyToDto() {
        AgencyDto agencyDto = agencyMapper.mapAgencyToDto(agency);
        assertEquals(agency.getAgencyName(), agencyDto.getAgencyName());
        assertEquals(agency.getAgencyId(), agencyDto.getAgencyId());
        assertEquals(agency.getAgencyAddress().getStreet(), agencyDto.getAgencyAddressDto().getStreet());
        assertEquals(agency.getAgencyAddress().getTown(), agencyDto.getAgencyAddressDto().getTown());
        assertEquals(agency.getAgencyAddress().getRegion(), agencyDto.getAgencyAddressDto().getRegion());
    }

    @Test
    void mapDtoToAgency() {
        Agency agency = agencyMapper.mapDtoToAgency(agencyDto);
        assertEquals(agencyDto.getAgencyName(), agency.getAgencyName());
        assertEquals(agencyDto.getAgencyId(), agency.getAgencyId());
        assertEquals(agencyDto.getAgencyAddressDto().getStreet(), agency.getAgencyAddress().getStreet());
        assertEquals(agencyDto.getAgencyAddressDto().getTown(), agency.getAgencyAddress().getTown());
        assertEquals(agencyDto.getAgencyAddressDto().getRegion(), agency.getAgencyAddress().getRegion());


    }
}
