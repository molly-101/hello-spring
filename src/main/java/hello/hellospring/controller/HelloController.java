package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("Jaeseo")
    public String Jaeseo(Model model){
        model.addAttribute("data", "Jaeseo에 접속하신 : 재서 님!");
        return "Jaeseo";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name, @RequestParam("number") int number){
        Hello hello = new Hello();
        hello.setName(name);
        hello.setNumber(number);
        return hello;
    }

    @GetMapping("human-api")
    @ResponseBody
    public Human HumanApi(@RequestParam("sex") String sex, @RequestParam("name") String name, @RequestParam("age") int age){
        Human human = new Human();
        human.setSex(sex);
        human.setName(name);
        human.setAge(age);
        human.setPassFail(true);
        return human;
    }

    static class Human {
        private String sex;
        private String name;
        private boolean passFail;
        private int age;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isPassFail() {
            return passFail;
        }

        public void setPassFail(boolean passFail) {
            this.passFail = passFail;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class Hello {
        private String name;
        private int number;

        public String returnString(String string){
            return string;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
