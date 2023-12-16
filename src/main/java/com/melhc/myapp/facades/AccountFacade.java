package com.melhc.myapp.facades;


import com.melhc.myapp.data.request.create.AccountCreateRequest;
import com.melhc.myapp.data.request.get.AccountGetRequest;
import com.melhc.myapp.data.response.create.AccountCreateResponse;
import com.melhc.myapp.data.response.get.AccountDetailResponse;
import com.melhc.myapp.facades.components.AccountComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountFacade {
    private final AccountComponent accountComponent;
    public AccountCreateResponse createAccount(AccountCreateRequest createRequest){
        return accountComponent.createAccount(createRequest);
    }

    public AccountDetailResponse getAccount(AccountGetRequest getRequest) {
        return accountComponent.getAccount(getRequest);
    }
}
