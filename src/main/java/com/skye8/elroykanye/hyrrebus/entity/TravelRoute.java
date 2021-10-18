package com.skye8.elroykanye.hyrrebus.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Table(name = "travel_route")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class TravelRoute implements Serializable {
    private static final long serialVersionUID = -1034936808056888005L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "route_id", nullable = false)
    private Long routeId;

    @Column(name = "fare_per_seat", nullable = false)
    private Long farePerSeat;

    @Column(name = "departure_time", nullable = false)
    private Instant departureTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bus_route_bus_id", nullable = false)
    private Bus bus;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "bus_drop_point_point_id", nullable = false)
    private BusStopPoint busDropPoint;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "bus_board_point_point_id", nullable = false)
    private BusStopPoint busBoardPoint;

    @OneToOne(mappedBy = "travelRoute", cascade = CascadeType.ALL, orphanRemoval = true)
    private TravelSchedule travelSchedule;

}