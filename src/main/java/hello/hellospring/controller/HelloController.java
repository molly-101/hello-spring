package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("Jaeseo")
    public String Jaeseo(Model model){
        model.addAttribute("data", "Jaeseo에 접속하신 : 재서 님!");
        return "Jaeseo";
    }

    @GetMapping("test1")
    public String jaeseo(Model model){
        model.addAttribute("data", "test1에 접속하신 : 재서 님!");
        return "Jaeseo";
    }
}
