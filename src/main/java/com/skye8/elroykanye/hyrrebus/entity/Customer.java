package com.skye8.elroykanye.hyrrebus.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "customer")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Customer implements Serializable {
    private static final long serialVersionUID = -5626453720008693614L;

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

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelSchedule> travelSchedules;

}