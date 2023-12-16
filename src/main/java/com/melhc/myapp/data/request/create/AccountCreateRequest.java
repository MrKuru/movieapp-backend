package com.melhc.myapp.data.request.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreateRequest {
    private String name;
    private String surname;
    private String phoneNumber;
    private String password;
}
