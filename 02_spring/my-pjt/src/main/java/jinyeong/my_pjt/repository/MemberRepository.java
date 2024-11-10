package jinyeong.my_pjt.repository;

import jinyeong.my_pjt.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // Optional: 원하는 값을 찾지 못했을 때 null 대신 감싸는 법?
    Member save(Member member);  // 회원 저장
    Optional<Member> findById(Long id);  // id로 찾기
    Optional<Member> findByName(String name);  // 이름으로 찾기
    List<Member> findAll();  // 저장된 모든 회원 반환
}
