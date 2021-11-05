package com.skye8.elroykanye.hyrrebus.api.dto;

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
public class TravelTicketDto {
    private Long ticketId;
    private Long totalFare;
    private String customerName;
    private Long busNumber;
}
