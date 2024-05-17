package com.youngho.springdemoproject.controller;


import com.youngho.springdemoproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    private final MemberService memberService;

    @Autowired
    public SpringController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("demo-MVC")
    public String demoMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "demo-template";
    }

    @GetMapping("demo-MVC2")
    @ResponseBody
    public String demoMvc2(@RequestParam(value = "name") String name) {
        return "demo " + name;
    }

    @GetMapping("demo-api")
    @ResponseBody
    public Demo demoApi(@RequestParam(value = "name") String name, @RequestParam(value = "city") String city) {
        Demo demo = new Demo();
        demo.setName(name);
        demo.setCity(city);
        return demo;
    }

    public static class Demo {

        private String name;
        private String city;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
