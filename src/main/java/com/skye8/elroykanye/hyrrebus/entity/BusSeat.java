package com.skye8.elroykanye.hyrrebus.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "bus_seat")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class BusSeat implements Serializable {
    private static final long serialVersionUID = 1294672048274166752L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "customer_name", nullable = false, length = 64)
    private String customerName;

    @Column(name = "customer_mobile", nullable = false, length = 32)
    private String customerMobile;

    @Column(name = "customer_email", nullable = false, length = 64)
    private String customerEmail;

    @Column(name = "seat_price", nullable = false)
    private Long seatPrice;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "bus_bus_id", nullable = false)
    private Bus bus;

    @ManyToOne(optional = false)
    @JoinColumn(name = "travel_schedule_schedule_id", nullable = false)
    private TravelSchedule travelSchedule;

}