package jinyeong.my_pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")  // 웹 어플리케이션에서 "/hello"라고 들어오면 이 메서드 호출
    public String hello(Model model) {
        model.addAttribute("data", "myInputData");
        
        // viewResolver가
        // resources/template/hello.html을 찾아서 return하도록
        return "hello";
    }
}
