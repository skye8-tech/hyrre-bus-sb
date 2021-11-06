package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */
@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
}
