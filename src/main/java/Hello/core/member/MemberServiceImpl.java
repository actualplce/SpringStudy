package Hello.core.member;

public class MemberServiceImpl implements MemberService{

    //DIP 위반 : Impl이 MemberRepository와 MemoryMemberRepository 모두 의존하고있으므로.
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
