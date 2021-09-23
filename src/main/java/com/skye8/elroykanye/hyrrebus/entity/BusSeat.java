package com.skye8.elroykanye.hyrrebus.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "bus_seat")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class BusSeat implements Serializable {
    private static final long serialVersionUID = 1294672048274166752L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id", nullable = false)
    private Long seatId;

    @Column(name = "seat_label", length = 16)
    private String seatLabel;

    @Column(name = "row_number")
    private Integer rowNumber;

    @Column(name = "column_number")
    private Integer columnNumber;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "bus_bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "travel_schedule_schedule_id")
    private TravelSchedule travelSchedule;

}