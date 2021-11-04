package com.skye8.elroykanye.hyrrebus.data.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "agency_address")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class AgencyAddress implements Serializable {
    private static final long serialVersionUID = -5081791633558094190L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private Long addressId;

    @Column(name = "street", length = 32)
    private String street;

    @Column(name = "town", length = 32)
    private String town;

    @Column(name = "region", length = 32)
    private String region;

    @OneToOne(mappedBy = "agencyAddress", cascade = CascadeType.ALL, orphanRemoval = true)
    private Agency agency;

}