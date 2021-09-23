package com.skye8.elroykanye.hyrrebus.service;

import com.skye8.elroykanye.hyrrebus.dto.request.AgencyRequest;
import com.skye8.elroykanye.hyrrebus.entity.Agency;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AgencyService {
    boolean addAgency(AgencyRequest newAgency);

    List<Agency> getAllAgencies();

    ResponseEntity<?> getAgencyByName(String agencyName);

    boolean updateAgency(AgencyRequest updatedAgency);

    void deleteAllAgencies();

    void deleteAgencyByName(String agencyName);
}
