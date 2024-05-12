package com.fastcampuspay.banking.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisteredBankAccount {

    @Getter
    private final String registerBankAccountId;

    @Getter
    private final String membershipId;

    @Getter
    private final String bankName;

    @Getter
    private final String bankAccountNumber;

    @Getter
    private final boolean linkedStatusIsValid;

    public static RegisteredBankAccount generateRegisterBankAccount(
            RegisteredBankAccount.RegisterBankAccountId registerBankAccountId,
            RegisteredBankAccount.MembershipId membershipId,
            RegisteredBankAccount.BankName bankName,
            RegisteredBankAccount.BankAccountNumber bankAccountNumber,
            LinkedStatusIsValid linkedStatusIsValid

    ) {
        return new RegisteredBankAccount(
                registerBankAccountId.registerBankAccountId,
                membershipId.membershipId,
                bankName.bankName,
                bankAccountNumber.bankAccountNumber,
                linkedStatusIsValid.linkedStatusIsValid
                );
    }


    //이 클래스를 이용해서만 해당 객체를 만들 수 있게 함.
    @Value
    public static class MembershipId {
        public MembershipId(String value) {
            this.membershipId = value;
        }

        String membershipId;
    }

    @Value
    public static class RegisterBankAccountId {
        public RegisterBankAccountId(String value) {
            this.registerBankAccountId = value;
        }

        String registerBankAccountId;
    }

    @Value
    public static class BankName {
        public BankName(String value) {
            this.bankName = value;
        }

        String bankName;
    }

    @Value
    public static class BankAccountNumber {
        public BankAccountNumber(String value) {
            this.bankAccountNumber = value;
        }

        String bankAccountNumber;
    }

    @Value
    public static class LinkedStatusIsValid {
        public LinkedStatusIsValid(boolean value) {
            this.linkedStatusIsValid = value;
        }

        boolean linkedStatusIsValid;
    }

}
