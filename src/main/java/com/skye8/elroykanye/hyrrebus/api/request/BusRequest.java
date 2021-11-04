package com.skye8.elroykanye.hyrrebus.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusRequest {
    @JsonProperty(value = "bus_name")
    private String busName;

    @JsonProperty(value = "plate_number")
    private String plateNumber;

    @JsonProperty(value = "bus_number")
    private Long busNumber;

    @JsonProperty(value = "row_number")
    private Integer rowNumber;

    @JsonProperty(value = "col_number")
    private Integer columnNumber;

    @JsonProperty(value = "bus_type")
    private String busType;
}
