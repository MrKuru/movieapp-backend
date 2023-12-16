package com.melhc.myapp.controller;


import com.melhc.myapp.data.request.create.AccountCreateRequest;
import com.melhc.myapp.data.request.get.AccountGetRequest;
import com.melhc.myapp.data.response.create.AccountCreateResponse;
import com.melhc.myapp.data.response.get.AccountDetailResponse;
import com.melhc.myapp.facades.AccountFacade;
import com.melhc.myapp.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class AccountController implements AccountService {

    private final AccountFacade accountFacade;
    @Override
    public AccountCreateResponse createAccount(AccountCreateRequest createRequest) {
        return accountFacade.createAccount(createRequest);
    }

    @Override
    public AccountDetailResponse getAccount(AccountGetRequest getRequest) {
        return  accountFacade.getAccount(getRequest);
    }
}
