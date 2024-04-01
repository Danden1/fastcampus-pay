package com.fastcampuspay.membership.application.port.in;

import com.fastcampuspay.membership.domain.Membership;
import common.UseCase;

//밖에서 안으로 와서..?
public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
