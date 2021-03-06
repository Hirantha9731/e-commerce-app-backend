package com.example.mobileaccessoriesbackend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String contactNo;
    private String address;
    private String city;
}
