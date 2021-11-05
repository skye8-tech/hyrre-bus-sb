package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.TravelTicketService;
import com.skye8.elroykanye.hyrrebus.data.repository.TravelTicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Juvitus
 * created on 06-11-21
 */

@Service
@AllArgsConstructor
public class TravelTicketImpl implements TravelTicketService {
    private final TravelTicketRepository travelTicketRepository;

}
