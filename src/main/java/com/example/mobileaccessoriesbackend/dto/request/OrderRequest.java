package com.example.mobileaccessoriesbackend.dto.request;


import com.example.mobileaccessoriesbackend.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {

    private Long id;
    private String description;
    private String deliverAddress;
    private String customerId;
    private Long branchId;
    private List<OrderDetailRequest> requestList;
    private PaymentType paymentType;

}
