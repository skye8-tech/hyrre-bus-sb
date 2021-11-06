package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.BusStopPointService;
import com.skye8.elroykanye.hyrrebus.data.repository.BusStopPointRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Service
@AllArgsConstructor
public class BusStopPointServiceImpl implements BusStopPointService {
    private final BusStopPointRepository busStopPointRepository;
}
