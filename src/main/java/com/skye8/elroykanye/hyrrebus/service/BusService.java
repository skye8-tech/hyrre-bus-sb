package com.skye8.elroykanye.hyrrebus.service;

import com.skye8.elroykanye.hyrrebus.dto.request.BusRequest;
import com.skye8.elroykanye.hyrrebus.entity.Bus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BusService {
    boolean addBus(BusRequest newBus, String agencyName);

    ResponseEntity<List<Bus>> getAllBusesByAgencyName(String agencyName);
}
