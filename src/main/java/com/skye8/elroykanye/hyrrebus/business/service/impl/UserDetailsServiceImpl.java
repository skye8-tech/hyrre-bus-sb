package com.skye8.elroykanye.hyrrebus.business.service.impl;

import com.skye8.elroykanye.hyrrebus.data.entity.AgencyUser;
import com.skye8.elroykanye.hyrrebus.data.repository.AgencyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

  private final AgencyUserRepository agencyUserRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    final AgencyUser agencyUser = agencyUserRepository.findByUsername(username)
            .orElseThrow(() -> {
              throw new UsernameNotFoundException("User '" + username + "' not found");
            });

    return org.springframework.security.core.userdetails.User//
        .withUsername(username)//
        .password(agencyUser.getPassword())//
        .authorities("USER")// TODO add authorities
        .accountExpired(false)//
        .accountLocked(false)//
        .credentialsExpired(false)//
        .disabled(false)//
        .build();
  }

}
