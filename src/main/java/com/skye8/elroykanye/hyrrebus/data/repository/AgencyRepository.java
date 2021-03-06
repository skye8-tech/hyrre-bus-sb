package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */
@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {

    Optional<Agency> findByAgencyName(String agencyName);

    void deleteByAgencyName(String agencyName);
}
