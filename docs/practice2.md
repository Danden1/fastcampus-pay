# 2장 정리

### JPA 관련

```java
@Override
public MembershipJpaEntity modifyMembership(Membership.MembershipId membershipId, Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
    MembershipJpaEntity entity = membershipRepository.getById(Long.parseLong(membershipId.getMembershipId()));

    entity.setName(membershipName.getMembershipName());
    entity.setAddress(membershipAddress.getMembershipAddress());
    entity.setEmail(membershipEmail.getMembershipEmail());
    entity.setCorp(membershipIsCorp.isMembershipIsCorp());
    entity.setValid(membershipIsValid.isMembershipIsValid());

    return membershipRepository.save(entity);
}
```

이 코드에서 jpa이용해서 찾고, set을 한 뒤 다시 save를 함.
직관적이지만, 성능상에서 별로. 그래서 이런 작업은 쿼리를 이용하는 것이 좋음.

