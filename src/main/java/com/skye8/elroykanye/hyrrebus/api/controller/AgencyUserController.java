package com.skye8.elroykanye.hyrrebus.api.controller;

import com.skye8.elroykanye.hyrrebus.business.service.AgencyUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/agency_user")
public class AgencyUserController {
    private final AgencyUserService agencyUserService;
}
