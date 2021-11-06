package com.skye8.elroykanye.hyrrebus.api.dto;

import com.skye8.elroykanye.hyrrebus.data.entity.AgencyAddress;
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
public class AgencyDto {
    private Long agencyId;

    private String agencyName;

}
