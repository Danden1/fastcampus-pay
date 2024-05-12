package com.fastcampuspay.banking.adapter.out.external.bank;

import com.fastcampuspay.banking.adapter.out.persistence.SpringDataRegisteredBankAccountRepository;
import com.fastcampuspay.banking.application.port.out.RequestBankAccountInfoPort;
import com.fastcampuspay.banking.application.port.out.RequestExternalFirmbankingPort;
import com.fastcampuspay.common.ExternalSystemAdapter;
import lombok.RequiredArgsConstructor;

@ExternalSystemAdapter
@RequiredArgsConstructor
public class BankAccountAdapter implements RequestBankAccountInfoPort, RequestExternalFirmbankingPort {

    private final SpringDataRegisteredBankAccountRepository bankAccountRepository;


    @Override
    public BankAccount getBankAccountInfo(GetBankAccountRequest request) {

        //외부 은행 http 통신을 구현하진 못함.

        return new BankAccount(request.getBankName(), request.getBankAccountNumber(), true);
    }

    @Override
    public FirmbankingResult requestExternalFirmbanking(ExternalFirmbankingRequest request) {
        //실제 외부 은행과 http 통신
        // 펌뱅킹 요청, 그 결과를 FirmbankingResult로 파싱.

        FirmbankingResult result = new FirmbankingResult(0);

        return result;

    }
}
