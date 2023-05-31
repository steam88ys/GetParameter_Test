package kr.hs.study.GetParameter_Test.controller;

import kr.hs.study.GetParameter_Test.dto.join;
import kr.hs.study.GetParameter_Test.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

//    @PostMapping("/re_login")
//    public String re_login(@RequestParam("user_id") String id,
//                           @RequestParam("user_pass") String pass) {
//        System.out.println("id: " + id + ", pass: " + pass);
//        return "result";
//    }

    // @ModelAttribut로 받는다. dto가 있어야 함
    // dto ==> 자바파일
    @PostMapping("/re_login")
    public String re_login(@ModelAttribute login log) {
        // login객체 log를 만들고 사용자의 입력값을 멤버변수 setMethod 이용해서 자동주입
        System.out.println("id: " + log.getUser_id() + ", pass: " + log.getUser_pass());
        return "result";
    }

    @GetMapping("/joinUs")
    public String join() {
        return "join";
    }

    // HttpServletRequet
//    @PostMapping("/join")
//    public String join(HttpServletRequest req) {
//        String id = req.getParameter("id");
//        String pass = req.getParameter("pass");
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        String tel = req.getParameter("tel");
//        String local = req.getParameter("local");
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // WebRequest
//    @PostMapping("/join")
//    public String join(WebRequest req) {
//        String id = req.getParameter("id");
//        String pass = req.getParameter("pass");
//        String name = req.getParameter("name");
//        String email = req.getParameter("email");
//        String tel = req.getParameter("tel");
//        String local = req.getParameter("local");
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // @RequestParam
//    @PostMapping("/join")
//    public String join(@RequestParam("id") String id,
//                       @RequestParam("pass") String pass,
//                       @RequestParam("name") String name,
//                       @RequestParam("email") String email,
//                       @RequestParam("tel") String tel,
//                       @RequestParam("local") String local) {
//        System.out.println("id: "+id);
//        System.out.println("pass: "+pass);
//        System.out.println("name: "+name);
//        System.out.println("email: "+email);
//        System.out.println("tel: "+tel);
//        System.out.println("local: "+local);
//        return "result";
//    }

    // @ModelAttribute
    @PostMapping("/join")
    public String join(@ModelAttribute join t ){
        System.out.println("id: "+t.getId());
        System.out.println("pass: "+t.getPass());
        System.out.println("name: "+t.getName());
        System.out.println("email: "+t.getEmail());
        System.out.println("tel: "+t.getTel());
        System.out.println("local: "+t.getLocal());
        return "result";
    }

}
