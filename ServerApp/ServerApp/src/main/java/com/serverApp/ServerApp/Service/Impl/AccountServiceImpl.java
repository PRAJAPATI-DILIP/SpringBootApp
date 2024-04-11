package com.serverApp.ServerApp.Service.Impl;

import com.serverApp.ServerApp.Entity.Account;
import com.serverApp.ServerApp.Mapper.AccountMapper;
import com.serverApp.ServerApp.Model.AccountDto;
import com.serverApp.ServerApp.Repository.AccountRepository;
import com.serverApp.ServerApp.Service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

   public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mopToAccount(accountDto);
        Account accountSave = null;
        if (accountDto != null){
            accountSave =  accountRepository.save(account);
        }
        return AccountMapper.mopToAccountDto(accountSave);
    }
}
