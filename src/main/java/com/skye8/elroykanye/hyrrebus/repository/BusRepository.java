package com.skye8.elroykanye.hyrrebus.repository;

import com.skye8.elroykanye.hyrrebus.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
}
