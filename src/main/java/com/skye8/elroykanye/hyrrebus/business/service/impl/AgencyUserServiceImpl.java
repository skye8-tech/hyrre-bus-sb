package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.AgencyUserService;
import com.skye8.elroykanye.hyrrebus.data.repository.AgencyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgencyUserServiceImpl implements AgencyUserService {
    private final AgencyUserRepository agencyUserRepository;
}
