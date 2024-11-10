package jinyeong.my_pjt.repository;

import jinyeong.my_pjt.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();  // 회원 정보 저장용
    private static long sequence = 0L;  // 회원 번호 자동 생성을 위해?

    // static은 모든 객체가 공유함! 모든 인스턴스에게 적용 가능한 값

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);  // key-value 쌍
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));  // null인 경우 대비해서
    }

    @Override
    public Optional<Member> findByName(String name) {
        // 람다식 사용
        return store.values().stream()                            // store의 value와
                .filter(member -> member.getName().equals(name))  // 입력한 name이 일치하면 반환
                .findAny();                                       // 끝까지 없으면 Optional로 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
