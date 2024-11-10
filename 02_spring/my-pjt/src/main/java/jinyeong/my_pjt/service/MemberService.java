package jinyeong.my_pjt.service;

import jinyeong.my_pjt.domain.Member;
import jinyeong.my_pjt.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    // final은 변경 불가능하게 만듦
    // 상수, 메서드 오버라이딩 금지, 클래스 상속 금지 등
//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    // DI(Dependency Injection, 의존성 주입): 외부에서 생성자를 통해 인스턴스 주입
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public Long join(Member member) {
        validateDuplicateMember(member);  // 이름 중복 확인
        memberRepository.save(member);
        return member.getId();
    }

    // 이름 중복 확인
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())  // 결과가 Optional로 감싸져 있음
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    // 특정 회원 조회
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
