package com.skye8.elroykanye.hyrrebus.data.repository;

import com.skye8.elroykanye.hyrrebus.data.entity.BusSeat;
import com.skye8.elroykanye.hyrrebus.data.entity.TravelTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Juvitus
 * created on 06-11-21
 */


@Repository
public interface TravelTicketRepository extends JpaRepository<TravelTicket, Long> {
}