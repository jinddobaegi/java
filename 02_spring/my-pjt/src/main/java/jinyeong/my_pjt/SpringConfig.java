package jinyeong.my_pjt;

import jinyeong.my_pjt.repository.MemberRepository;
import jinyeong.my_pjt.repository.MemoryMemberRepository;
import jinyeong.my_pjt.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
