package com.skye8.elroykanye.hyrrebus.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Table(name = "skye8travel_schedule")
@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class TravelSchedule implements Serializable {
    private static final long serialVersionUID = -2575731911391050319L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_id", nullable = false)
    private Long scheduleId;

    @Column(name = "boarding_point", length = 64)
    private String boardingPoint;

    @Column(name = "dropping_point", length = 64)
    private String droppingPoint;

    @Column(name = "departure_time")
    private Instant departureTime;

    @Column(name = "schedule_date")
    private Instant scheduleDate;

    @Column(name = "fare_amount")
    private Long fareAmount;

}