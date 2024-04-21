package com.fastcampuspay.membership.application.port.in;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fastcampuspay.common.SelfValidating;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class ModifyMembershipCommand extends SelfValidating<ModifyMembershipCommand> {

    @NotNull
    private final String membershipId;

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    @NotNull
    private final String address;

    @AssertTrue
    private final boolean isValid;

    @NotNull
    private final boolean isCorp;

    public ModifyMembershipCommand(String membershipId, @NotNull String name, String email, String address, boolean isValid, boolean isCorp) {
        this.membershipId = membershipId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
        this.isCorp = isCorp;

        //이를 이용하여 NotNull 체크 가능
        this.validateSelf();
    }
}
