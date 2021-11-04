package com.skye8.elroykanye.hyrrebus.data.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "bus_stop_point")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class BusStopPoint implements Serializable {
    private static final long serialVersionUID = -2039171374710259434L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "point_id", nullable = false)
    private Long pointId;

    @Column(name = "point_town", nullable = false, length = 32)
    private String pointTown;

    @Column(name = "point_region", nullable = false, length = 32)
    private String pointRegion;

    @Column(name = "point_quarter", length = 32)
    private String pointQuarter;

    @OneToOne(mappedBy = "busBoardPoint", orphanRemoval = true)
    private TravelRoute travelRouteBoard;

    @OneToOne(mappedBy = "busDropPoint", orphanRemoval = true)
    private TravelRoute travelRouteDrop;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "agency_agency_id", nullable = false, unique = true)
    private Agency agency;

}