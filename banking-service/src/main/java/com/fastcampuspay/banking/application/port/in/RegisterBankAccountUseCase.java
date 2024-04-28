package com.fastcampuspay.banking.application.port.in;

import com.fastcampuspay.banking.domain.RegisteredBankAccount;

//밖에서 안으로 와서..?
public interface RegisterBankAccountUseCase {

    RegisteredBankAccount registerBankAccount(RegisterBankAccountCommand command);
}
