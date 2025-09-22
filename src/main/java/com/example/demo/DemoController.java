package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController{
    @GetMapping("/hello") // 전송 방식 GET
    public String hello(Model model) {
        model.addAttribute("data", " 반갑습니다."); // model 설정
        return "hello"; // hello.html 연결
    }
    @GetMapping("/hello2") // 전송 방식 GET + 새로운 매핑 추가
    public String hello2(Model model) {
        model.addAttribute("data1", " 송도헌님."); // model 설정
        model.addAttribute("data2", " 반갑습니다."); // model 설정
        model.addAttribute("data3", " 오늘."); // model 설정
        model.addAttribute("data4", " 날씨는."); // model 설정
        model.addAttribute("data5", " 매우 좋습니다."); // model 설정
        return "hello2"; // hello2.html 연결
    }
    @GetMapping("/about_detailed")
    public String about_detailed(Model model){
        return "about_detailed";
    }
} 