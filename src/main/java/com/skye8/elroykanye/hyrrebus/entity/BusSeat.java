package com.skye8.elroykanye.hyrrebus.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "skye8bus_seat")
@Entity
public class BusSeat implements Serializable {
    private static final long serialVersionUID = -8365023638313212948L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "bus_bus_id", nullable = false)
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}