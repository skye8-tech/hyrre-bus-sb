package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.TravelRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Repository
public interface TravelRouteRepository extends JpaRepository<TravelRoute, Long> {
}
