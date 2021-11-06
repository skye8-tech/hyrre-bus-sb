package com.skye8.elroykanye.hyrrebus.api.controller;

import com.skye8.elroykanye.hyrrebus.business.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nfon Andrew.
 * created on 06-11-21
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/customer")
public class CustomerController {
    private final CustomerService customerService;
}
