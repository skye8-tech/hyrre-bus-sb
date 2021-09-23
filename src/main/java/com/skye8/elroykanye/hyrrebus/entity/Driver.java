package com.skye8.elroykanye.hyrrebus.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "driver")
@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class Driver {
    @Id
    @Column(name = "driver_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long driverId;

    @Column(name = "driver_name", length = 64)
    private String driverName;

    @Column(name = "driver_contact")
    private String driverContact;

}