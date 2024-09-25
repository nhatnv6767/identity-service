package com.devteria.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserCreationRequest {

    // validation cua Spring thi yeu cau chung ta truyen vao 1 const
    // trong message chinh la cai key cua ErrorCode
    @Size(min = 3, message = "USERNAME_INVALID")
    private String username;

    @Size(min = 8, message = "PASSWORD_INVALID")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;


}
