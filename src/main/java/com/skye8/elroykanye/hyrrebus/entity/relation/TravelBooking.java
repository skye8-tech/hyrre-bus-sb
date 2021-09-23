package com.skye8.elroykanye.hyrrebus.entity.relation;

import com.skye8.elroykanye.hyrrebus.entity.BusSeat;
import com.skye8.elroykanye.hyrrebus.entity.Customer;
import com.skye8.elroykanye.hyrrebus.entity.TravelSchedule;
import com.skye8.elroykanye.hyrrebus.entity.composite.TravelBookingKey;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "skye8travel_booking", indexes = {
        @Index(name = "idx_travelbooking_customer_id", columnList = "customer_id")
})
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class TravelBooking implements Serializable {
    private static final long serialVersionUID = 3462304538554113141L;

    @EmbeddedId
    private TravelBookingKey travelBookingKey;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "customer_customer_id", nullable = false)
    @MapsId(value = "customerId")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "travel_schedule_schedule_id", nullable = false)
    @MapsId(value = "travelScheduleId")
    private TravelSchedule travelSchedule;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "booking_payment_ID")
    private BookingPayment bookingPayment;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn
    private List<BusSeat> bookedSeats;

}