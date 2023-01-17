package hello.core.member;

// 인터페이스 구현체가 하나면 Impl 을 붙이는게 관행
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 구현 객체로 생성해야 null point exception 미발생

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
