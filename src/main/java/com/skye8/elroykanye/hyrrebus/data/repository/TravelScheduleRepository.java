package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.api.controller.TravelScheduleController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelScheduleRepository extends JpaRepository<TravelScheduleController, Long> {
}
