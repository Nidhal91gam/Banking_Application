package com.Gam.Banking.dto;

import com.Gam.Banking.models.Transaction;
import com.Gam.Banking.models.TransactionType;
import com.Gam.Banking.models.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class TransactionDto {

    private Integer id;

    private BigDecimal amount;

    private TransactionType type;

    private String destinationIban ;

    private Integer userId;

    public static TransactionDto TransactionToTransactionDto(Transaction transaction){
        return TransactionDto.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .destinationIban(transaction.getDestinationIban())
                .userId(transaction.getId())
                .build();
    }

    public static Transaction TransactionDtoToTransaction(TransactionDto transaction){
        return Transaction.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .destinationIban(transaction.getDestinationIban())
                .user(User.builder()
                        .id(transaction.getId())
                        .build())
                .build();
    }
}
