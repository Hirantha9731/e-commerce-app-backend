package com.example.mobileaccessoriesbackend.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchResponse {

    private Long id;
    private String branchName;
    private String branchLocation;
}
