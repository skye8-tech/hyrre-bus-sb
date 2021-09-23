package com.skye8.elroykanye.hyrrebus.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long busId;

    @Column(name = "bus_name", length = 50)
    private String busName;

    @Column(name = "plate_number", length = 50)
    private String plateNumber;

    @Column(name = "bus_number", length = 50)
    private String busNumber;

    @Column(name = "bus_type", length = 25)
    private String busType;
    
    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "column_number")
    private Integer columnNumber;

    @Column(name = "row_number")
    private Integer rowNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "agency_agency_id", nullable = false)
    private Agency agency;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "bus_bus_id")
    private List<BusSeat> busSeats;

}
