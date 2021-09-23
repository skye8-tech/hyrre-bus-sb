package com.skye8.elroykanye.hyrrebus.entity.relation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Table(name = "skye8booking_payment")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class BookingPayment implements Serializable {
    private static final long serialVersionUID = -3045985355868682063L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id", nullable = false)
    private Long paymentId;


    @OneToOne(fetch = FetchType.LAZY, mappedBy = "bookingPayment", cascade = CascadeType.ALL, orphanRemoval = true)
    private TravelBooking travelBooking;

    @Column(name = "payment_date")
    private Instant paymentDate;

}