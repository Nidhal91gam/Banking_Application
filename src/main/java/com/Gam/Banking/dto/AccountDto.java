package com.Gam.Banking.dto;


import com.Gam.Banking.models.Account;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountDto {
    private Integer id;

    private String iban;

    private UserDto user;

    public static AccountDto accountToaccountDto(Account account){

        return AccountDto.builder()
                .id(account.getId())
                .iban(account.getIban())
                .user(UserDto.UserToDto(account.getUser()))
                .build();
    }
    public static Account accountDtoToaccount(AccountDto account){

       return Account.builder()
               .id(account.getId())
               .iban(account.getIban())
               .user(UserDto.DtoToUser((account.getUser())))
               .build();

    }
}
