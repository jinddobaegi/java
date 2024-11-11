package jinyeong.my_pjt.controller;

import jinyeong.my_pjt.domain.Member;
import jinyeong.my_pjt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

// 컨트롤러는 Config에 등록 못함, 어쩔 수 없음
@Controller
public class MemberController {

    private final MemberService memberService;  // new 대신 스프링 컨테이너에서 가져다 쓰도록 만들자

    @Autowired  // 스프링 컨테이너에서 스프링 빈으로서 가져다 쓰게 해줌 => 이것도 DI
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());  // form.setName()은 Spring이 알아서 해줌

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);

        return "members/memberList";
    }
}
