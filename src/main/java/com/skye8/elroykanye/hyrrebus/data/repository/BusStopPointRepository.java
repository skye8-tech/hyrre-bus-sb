package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.BusStopPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Repository
public interface BusStopPointRepository extends JpaRepository<BusStopPoint, Long> {
}
