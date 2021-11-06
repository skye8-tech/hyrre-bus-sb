package com.skye8.elroykanye.hyrrebus.api.dto;

import lombok.*;

/**
 * @author Tanju Brunostar
 * created on 06/11/21
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusStopPointDto {
    private Long pointId;

    private String pointTown;

    private String pointRegion;

    private String pointQuarter;
}
