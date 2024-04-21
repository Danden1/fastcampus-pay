package com.fastcampuspay.membership.adapter.in.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//java 14 이상이면, recrod로
//membership id 나 isValid 가 없는 이유는 실제 시스템 상에서 필요한 부분이기 때문에.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyMembershipRequest {
    private String membershipId;
    private String name;
    private String email;
    private String address;
    private boolean isValid;
    private boolean isCorp;
}
