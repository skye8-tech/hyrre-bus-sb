package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.TravelRouteService;
import com.skye8.elroykanye.hyrrebus.data.repository.TravelRouteRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.AllArgsConstructor;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Server
@AllArgsConstructor
public class TravelRouteImpl implements TravelRouteService {
    private final TravelRouteRepository travelRouteRepository;
}
