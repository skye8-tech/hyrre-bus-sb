package com.skye8.elroykanye.hyrrebus.entity;

import com.skye8.elroykanye.hyrrebus.entity.enums.BusType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "bus")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Bus implements Serializable {
    private static final long serialVersionUID = -5261768416149458783L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bus_id", nullable = false)
    private Long busId;

    @Column(name = "bus_name", length = 32)
    private String busName;

    @Column(name = "plate_number", length = 32)
    private String plateNumber;

    @Column(name = "bus_number")
    private Long busNumber;

    @Column(name = "bus_capacity")
    private Integer busCapacity;

    @Column(name = "number_of_rows")
    private Integer numberOfRows;

    @Column(name = "number_of_columns")
    private Integer numberOfColumns;

    // enumerated bus type
    @Enumerated(EnumType.STRING)
    @Column(name = "bus_type", nullable = false)
    private BusType busType;

    // agency mapping
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "agency_agency_id", nullable = false)
    private Agency agency;

    // bus seats mapping
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "bus_bus_id")
    private List<BusSeat> busSeats;

    @OneToMany(mappedBy = "bus", orphanRemoval = true)
    private List<TravelRoute> travelRoutes;

}