package com.skye8.elroykanye.hyrrebus.business.service;

import com.skye8.elroykanye.hyrrebus.api.request.BusRequest;
import com.skye8.elroykanye.hyrrebus.data.entity.Bus;

import java.util.List;

public interface BusService {
    boolean addBus(BusRequest newBus, String agencyName);

    List<Bus> getAllBusesByAgencyName(String agencyName);

    List<Bus> getAllBuses();
}
