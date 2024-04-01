package com.fastcampuspay.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    @Getter
    private final String membershipId;
    @Getter
    private final String name;

    @Getter
    private final String email;
    @Getter
    private final String address;
    @Getter
    private final boolean isValid;
    @Getter
    private final boolean isCorp;

    public static Membership generateMember(
            MembershipId membershipId,
            MembershipName membershipName,
            MembershipEmail membershipEmail,
            MembershipAddress membershipAddress,
            MembershipIsValid membershipIsValid,
            MembershipIsCorp membershipIsCorp
    ) {
        return new Membership(
                membershipId.membershipId,
                membershipName.membershipName,
                membershipEmail.membershipEmail,
                membershipAddress.membershipAddress,
                membershipIsValid.membershipIsValid,
                membershipIsCorp.membershipIsCorp);
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
    public static class MembershipName {

        public MembershipName(String membershipName) {
            this.membershipName = membershipName;
        }

        String membershipName;
    }

    @Value
    public static class MembershipEmail {

        public MembershipEmail(String membershipEmail) {
            this.membershipEmail = membershipEmail;
        }

        String membershipEmail;
    }

    @Value
    public static class MembershipAddress {

        public MembershipAddress(String membershipAddress) {
            this.membershipAddress = membershipAddress;
        }

        String membershipAddress;
    }

    @Value
    public static class MembershipIsValid {

        public MembershipIsValid(boolean membershipIsValid) {
            this.membershipIsValid = membershipIsValid;
        }

        boolean membershipIsValid;
    }

    @Value
    public static class MembershipIsCorp {

        public MembershipIsCorp(boolean membershipIsCorp) {
            this.membershipIsCorp = membershipIsCorp;
        }

        boolean membershipIsCorp;
    }

}
