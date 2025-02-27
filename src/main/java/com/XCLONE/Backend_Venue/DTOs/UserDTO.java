package com.XCLONE.Backend_Venue.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class UserDTO {
    @NonNull
    private String firstName;
    private String lastName;
    @NonNull
    private String userName;
    private String email;
    private boolean sentimentAnalysis;
    @NonNull
    private String password;
    private String phoneNo;
}
