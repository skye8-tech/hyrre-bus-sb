package com.skye8.elroykanye.hyrrebus.data.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "travel_ticket")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class TravelTicket implements Serializable {
    private static final long serialVersionUID = -2408168366940786984L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ticket_id", nullable = false)
    private Long ticketId;

    @Column(name = "total_fare", nullable = false)
    private Long totalFare;

    @Column(name = "customer_name", nullable = false, length = 128)
    private String customerName;

    @Column(name = "bus_number", nullable = false)
    private Long busNumber;

    // TODO add support for seat list

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "travel_schedule_schedule_id", nullable = false)
    private TravelSchedule travelSchedule;

}