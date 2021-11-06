package com.skye8.elroykanye.hyrrebus.api.dto;

import com.skye8.elroykanye.hyrrebus.data.entity.Agency;
import com.skye8.elroykanye.hyrrebus.data.entity.enums.BusType;
import lombok.*;

/**
 * @author Elroy Kanye
 * created on: 06-11-21
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private Long busId;
    private String busName;
    private String plateNumber;
    private Long busNumber;
    private Integer busCapacity;
    private Integer numberOfRows;
    private Integer numberOfColumns;
    private BusType busType;


}
