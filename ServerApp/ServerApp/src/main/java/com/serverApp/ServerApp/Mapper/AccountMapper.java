package com.serverApp.ServerApp.Mapper;

import com.serverApp.ServerApp.Entity.Account;
import com.serverApp.ServerApp.Model.AccountDto;

public class AccountMapper {
    public static Account mopToAccount(AccountDto accountDto){
        Account account =  new Account();
        account.setId(accountDto.getId());
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());

        return account;
    }

    public static AccountDto mopToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return accountDto;
    }
}
