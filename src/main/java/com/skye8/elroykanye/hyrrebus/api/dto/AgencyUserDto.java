package com.skye8.elroykanye.hyrrebus.api.dto;

import lombok.*;

/**
 * @author  Elroy Kanye
 * created on: 06-11-21
 *
 * modified by Tanju Brunostar
 * modified on: 11-11-21
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgencyUserDto {
    private Long agencyUserId;

    private String username;

    private String email;

    private String firstName;

    private String phoneNumber;
}
