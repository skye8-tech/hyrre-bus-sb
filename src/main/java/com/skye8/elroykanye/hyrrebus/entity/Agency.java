package com.skye8.elroykanye.hyrrebus.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "agency")
@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Agency implements Serializable {
    private static final long serialVersionUID = -6877042702045500293L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agency_id", nullable = false)
    private Long agencyId;

    @Column(name = "agency_name", nullable = false, length = 32)
    private String agencyName;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "agency_address_address_id", nullable = false)
    private AgencyAddress agencyAddress;

    @OneToMany(mappedBy = "agency", orphanRemoval = true)
    private List<Bus> buses;

}