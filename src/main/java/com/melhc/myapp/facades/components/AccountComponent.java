package com.melhc.myapp.facades.components;


import com.melhc.myapp.data.entity.Account;
import com.melhc.myapp.data.repository.AccountRepository;
import com.melhc.myapp.data.request.create.AccountCreateRequest;
import com.melhc.myapp.data.request.get.AccountGetRequest;
import com.melhc.myapp.data.response.create.AccountCreateResponse;
import com.melhc.myapp.data.response.get.AccountDetailResponse;
import com.melhc.myapp.mappers.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountComponent {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountCreateResponse createAccount(AccountCreateRequest createRequest){
        final Account account = accountRepository.save(accountMapper.toEntity(createRequest));
        return accountMapper.toDto(account);
    }

    public AccountDetailResponse getAccount(AccountGetRequest getRequest) {
        final Account account = accountRepository.findByName(getRequest.getName());
        return accountMapper.toDtoDetail(account);
    }
}
