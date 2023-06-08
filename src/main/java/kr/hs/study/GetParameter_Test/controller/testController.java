package kr.hs.study.GetParameter_Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req, Model model) {
        String data1 = req.getParameter("data1");
        String data2 = req.getParameter("data2");
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);
        
        // data1, data2를 model에 넣는다
        model.addAttribute("d1", data1);
        model.addAttribute("d2", data2);

        return "test2";
    }
}
