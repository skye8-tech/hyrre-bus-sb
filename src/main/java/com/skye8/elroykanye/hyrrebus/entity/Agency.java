package com.skye8.elroykanye.hyrrebus.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Builder
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agencyId;

    @Column(name = "agency_name", length = 50)
    private String agencyName;

    @Column(name = "location", length = 50)
    private String location;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Bus> buses;


}
