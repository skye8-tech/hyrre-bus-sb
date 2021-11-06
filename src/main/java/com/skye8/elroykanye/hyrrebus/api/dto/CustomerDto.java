package com.skye8.elroykanye.hyrrebus.api.dto;

import com.skye8.elroykanye.hyrrebus.data.entity.Bus;
import com.skye8.elroykanye.hyrrebus.data.entity.TravelSchedule;
import lombok.*;

/**
 * @author Nfon Andrew
 * Created On  06-11-21
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long customerId;
    private String customerName;
    private String customerMobile;
    private String customerEmail;

}
