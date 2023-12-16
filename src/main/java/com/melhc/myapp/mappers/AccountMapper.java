package com.melhc.myapp.mappers;


import com.melhc.myapp.data.entity.Account;
import com.melhc.myapp.data.request.create.AccountCreateRequest;
import com.melhc.myapp.data.response.create.AccountCreateResponse;
import com.melhc.myapp.data.response.get.AccountDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountMapper {

    public Account toEntity(AccountCreateRequest createRequest){
        Account account = Account.builder()
                .name(createRequest.getName())
                .surname(createRequest.getSurname())
                .phoneNumber(createRequest.getPhoneNumber())
                .password(createRequest.getPassword())
                .build();
        return account;
    }

    public AccountCreateResponse toDto(Account account){
        AccountCreateResponse accountCreateResponse = AccountCreateResponse.builder()
                .id(account.getId())
                .build();
        return accountCreateResponse;
    }
    public AccountDetailResponse toDtoDetail(Account account){
        AccountDetailResponse accountDetailResponse = AccountDetailResponse.builder()
                .id(account.getId())
                .name(account.getName())
                .surname(account.getSurname())
                .password(account.getPassword())
                .phoneNumber(account.getPhoneNumber())
                .build();
        return accountDetailResponse;
    }
}
