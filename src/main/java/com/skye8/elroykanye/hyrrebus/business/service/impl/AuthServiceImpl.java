package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.business.service.AuthService;
import com.skye8.elroykanye.hyrrebus.data.repository.AgencyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AgencyUserRepository agencyUserRepository;
    private final UserDetailsServiceImpl userDetailsService;
}
