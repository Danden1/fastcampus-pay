package com.fastcampuspay.banking.application.port.in;

import com.fastcampuspay.banking.domain.FirmbankingRequest;

//밖에서 안으로 와서..?
public interface RequestFirmBankingUseCase {

    FirmbankingRequest requestFirmbanking(RequestFirmbankingCommand command);
}
