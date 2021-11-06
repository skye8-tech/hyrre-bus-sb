package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.AgencyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */
@Repository
public interface AgencyUserRepository extends JpaRepository<AgencyUser, Long> {
    Optional<AgencyUser> findByUsername(String username);
}
