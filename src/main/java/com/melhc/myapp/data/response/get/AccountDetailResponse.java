package com.melhc.myapp.data.response.get;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetailResponse {
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String password;
}
