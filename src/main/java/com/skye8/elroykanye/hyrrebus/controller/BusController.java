package com.skye8.elroykanye.hyrrebus.controller;

import com.skye8.elroykanye.hyrrebus.dto.request.BusRequest;
import com.skye8.elroykanye.hyrrebus.entity.Bus;
import com.skye8.elroykanye.hyrrebus.service.BusService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/bus")
public class BusController {
    private final BusService busService;

    @PostMapping(value = "/{agencyName}")
    public ResponseEntity<String> addBusByAgencyName(@RequestBody BusRequest busRequest, @PathVariable(value = "agencyName") String agencyName) {
        return busService.addBus(busRequest, agencyName) ?
                new ResponseEntity<>("Bus added", HttpStatus.CREATED):
                new ResponseEntity<>("Bus not added", HttpStatus.FORBIDDEN);
    }

    @GetMapping(value = "/{agencyName}")
    public List<Bus> getAllByAgencyName(@PathVariable(value = "agencyName") String agencyName) {
        return busService.getAllBusesByAgencyName(agencyName);
    }

    @GetMapping(value = "")
    public List<Bus> getAll() {
        return busService.getAllBuses();
    }

}
