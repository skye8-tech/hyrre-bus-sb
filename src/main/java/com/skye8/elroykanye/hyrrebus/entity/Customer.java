package com.skye8.elroykanye.hyrrebus.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "customer")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "customer_name", length = 50)
    private String customerName;

    @Column(name = "customer_email", length = 50)
    private String customerEmail;

    @Column(name = "customer_contact", length = 50)
    private String customerContact;

}