package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.BusSeatService;
import com.skye8.elroykanye.hyrrebus.data.repository.BusSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Juvitus
 * created on 06-11-21
 */

@Service
@AllArgsConstructor
public class BusSeatServiceImpl implements BusSeatService {
    private final BusSeatRepository busSeatRepository;
}
