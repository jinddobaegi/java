package jinyeong.my_pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")  // 웹 어플리케이션에서 "/hello"라고 들어오면 이 메서드 호출
    public String hello(Model model) {
        model.addAttribute("data", "myInputData");
        
        // viewResolver가
        // resources/template/hello.html을 찾아서 return하도록
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody  // html이 아닌 http의 body부분에 return 값을 넣겠다!
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        // getter, setter를 쓰는 게 java bean 표준 방식, property 접근 방식이라고 함
        // 메서드명은 무조건 get+필드명, set+필드명으로 해야 Jackson 라이브러리가 인식함
        private String name;  // 이 필드가 private이니까 외부에서 못 꺼냄

        // getter
        public String getName() {
            return name;
        }

        // setter
        public void setName(String name) {
            this.name = name;
        }
    }
}
