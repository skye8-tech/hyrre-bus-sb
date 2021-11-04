package com.skye8.elroykanye.hyrrebus.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgencyRequest {
    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "street")
    private String street;

    @JsonProperty(value = "town")
    private String town;

    @JsonProperty(value = "region")
    private String region;
}
