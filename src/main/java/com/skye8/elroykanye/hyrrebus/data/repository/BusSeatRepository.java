package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.BusSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Juvitus
 * created on 06-11-21
 */


@Repository
public interface BusSeatRepository extends JpaRepository<BusSeat, Long> {
}
