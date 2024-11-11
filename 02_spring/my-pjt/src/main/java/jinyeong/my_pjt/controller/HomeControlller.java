package jinyeong.my_pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlller {

    @GetMapping("/")
    public String home() {
        return "home";  // home.html을 return함
    }
}
