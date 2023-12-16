package com.melhc.myapp.service;


import com.melhc.myapp.data.request.create.AccountCreateRequest;
import com.melhc.myapp.data.request.get.AccountGetRequest;
import com.melhc.myapp.data.response.create.AccountCreateResponse;
import com.melhc.myapp.data.response.get.AccountDetailResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Validated
public interface AccountService {

    @PostMapping("accounts")
    AccountCreateResponse createAccount(@RequestBody @Valid AccountCreateRequest createRequest);

    @GetMapping("accounts/{id}")
    AccountDetailResponse getAccount(@RequestBody @Valid AccountGetRequest getRequest);
}
