package com.fastcampuspay.banking.adapter.out.external.bank;

import com.fastcampuspay.banking.adapter.out.persistence.SpringDataRegisteredBankAccountRepository;
import com.fastcampuspay.banking.application.port.out.RequestBankAccountInfoPort;
import com.fastcampuspay.common.ExternalSystemAdapter;
import lombok.RequiredArgsConstructor;

@ExternalSystemAdapter
@RequiredArgsConstructor
public class BankAccountAdapter implements RequestBankAccountInfoPort {

    private final SpringDataRegisteredBankAccountRepository bankAccountRepository;


    @Override
    public BankAccount getBankAccountInfo(GetBankAccountRequest request) {

        //외부 은행 http 통신을 구현하진 못함.

        return new BankAccount(request.getBankName(), request.getBankAccountNumber(), true);
    }
}
