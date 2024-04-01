# 1강 정리(헥사고날 아키텍처)

### 참고하면 좋은 자료

https://romanglushach.medium.com/hexagonal-architecture-the-secret-to-scalable-and-maintainable-code-for-modern-software-d345fdb47347


### Controller가 adapter.in에 있는 이유

외부에서 들어온 요청을 받기 때문에. 이는 외부와 http로 소통하기 때문.

### 패키지 구조

Application 이 비지니스 로직이 들어감. 그래서 port와 service가 있음.

궁금한 점은 domain 패키지는 왜 밖에 있는지 궁금함. 이 부분도 결국에는 비즈니스 로직이라고 생각함.

### 객체 보호 관련

`Membership` 클래스를 보면, 보호를 해놓았음.

즉, 이상한 값이 들어오지 않도록 해줌으로써 객체를 보호할 수 있음?

nextStep 에서 강조하는 원시객체 포장이랑 유사해보임. 차이점은 생성자도 외부에서 접근못하게 막음.

사실 굳이 이렇게 하는 것보다는, 원시 객체 포장하고 이 안에 유효성 검사등을 넣으면 될 것 같은데....


### 의문점

```java
public interface RegisterMembershipPort {
    MembershipJpaEntity createMembership(
            Membership.MembershipName membershipName,
            Membership.MembershipEmail membershipEmail,
            Membership.MembershipAddress membershipAddress,
            Membership.MembershipIsValid membershipIsValid,
            Membership.MembershipIsCorp membershipIsCorp
    );
}
```

여긴 port 부분임. 근데 JPA 라는 특정 기술에 의존. 이러면 유연하게 대처가 안되지 않는지?

