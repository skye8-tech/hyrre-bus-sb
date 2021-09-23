package com.skye8.elroykanye.hyrrebus.entity.composite;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@RequiredArgsConstructor
public class TravelBookingKey implements Serializable {
    private static final long serialVersionUID = 7845598128319955760L;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "travel_schedule_id")
    private Long travelScheduleId;

}