package kr.hs.study.GetParameter_Test.conrtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    // login 클릭 => 로그인 폼 (login.html)
    @GetMapping("/login")
    public String login_form() {
        return "login_form";
    }

//    @PostMapping("/re_login")
//    public String re_login(HttpServletRequest req) {
//        String id = req.getParameter("user_id");
//        String pass = req.getParameter("user_pass");
//        System.out.println("id: "+id+", pass: "+pass);
//        return "result";
//    }

//    @PostMapping("/re_login")
//    public String re_login(WebRequest req) {
//        String id = req.getParameter("user_id");
//        String pass = req.getParameter("user_pass");
//        System.out.println("id: " + id + ", pass: " + pass);
//        return "result";
//    }

    @PostMapping("/re_login")
    public String re_login(@RequestParam("user_id") String id,
                           @RequestParam("user_pass") String pass) {
        System.out.println("id: " + id + ", pass: " + pass);
        return "result";
    }
}
