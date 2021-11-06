package com.skye8.elroykanye.hyrrebus.api.controller;

import com.skye8.elroykanye.hyrrebus.business.service.BusStopPointService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/bus_stop_point")
public class BusStopPointController {
    private final BusStopPointService  busStopPointService;
}
