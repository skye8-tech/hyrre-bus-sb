package com.skye8.elroykanye.hyrrebus.api.controller;

import com.skye8.elroykanye.hyrrebus.business.service.BusSeatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juvitus
 * created on 06-11-21
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/bus_seat")
public class BusSeatController {
    private final BusSeatService busSeatService;

}
