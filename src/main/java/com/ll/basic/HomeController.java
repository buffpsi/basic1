package com.ll.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @Controller 의 의미
// 개발자가 스프링부트에게 말한다.
// 아래 있는 HomeController 는 컨트롤러이다.

public class HomeController {
    String s1 = "반갑습니다";
    String s2 = "즐거웠습니다";
    @GetMapping("/home/main")
    // @GetMapping("/home/main") 의 의미
    // 개발자가 스프링부트에게 말한다.
    // 만약에 /home/main 이런 요청이 오면 아래 메서드를 실행해줘
    @ResponseBody
    // @ResponseBody 의 의미
    // 아래 메서드를 실행한 후 그 리턴값을 응답으로 삼아줘
    public String showMain(){
        return "안녕하세요 " +"₩n"+"안녕녕녕"+
                "안녕히 가세요!";
    }
    @GetMapping("/home/main2")
    @ResponseBody
    public String showMain2(){
        return s1;
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showMain3(){
        return s2;
    }

}
