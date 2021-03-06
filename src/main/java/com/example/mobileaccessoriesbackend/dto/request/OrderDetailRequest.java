package com.example.mobileaccessoriesbackend.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailRequest {

    private Long productId;
    private int qty;
}
