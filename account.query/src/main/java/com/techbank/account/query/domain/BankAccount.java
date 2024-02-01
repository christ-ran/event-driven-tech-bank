package com.techbank.account.query.domain;

import com.techbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class BankAccount extends BaseEntity {
    @Id
    private String id;
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double balance;
}