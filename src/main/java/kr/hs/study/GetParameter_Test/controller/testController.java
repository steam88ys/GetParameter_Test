package kr.hs.study.GetParameter_Test.controller;

import kr.hs.study.GetParameter_Test.dto.test7;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/test3/{data1}/{data2}")
    public String test3(@PathVariable String data1,
                        @PathVariable String data2,
                        Model model) {
        model.addAttribute("d1", data1);
        model.addAttribute("d2", data2);
        return "test2";
    }

    @GetMapping("/test4")
    public String test3(@RequestParam("data1") int data1,
                        @RequestParam("data2") int data2,
                        Model model) {
        model.addAttribute("d1", data1);
        model.addAttribute("d2", data2);
        return "test2";
    }

    @GetMapping("/test5")
    public ModelAndView test5(@RequestParam String data1,
                              @RequestParam String data2,
                              ModelAndView mv) {
        mv.addObject("d1", data1);
        mv.addObject("d2", data2);
        mv.setViewName("test5");
        return mv;
    }

    @GetMapping("/test6")
    public String test6(Model model) {
        model.addAttribute("name", "kim");
        model.addAttribute("password", "1111");
        return "test6";
    }

    @GetMapping("/test7")
    public String test7(@ModelAttribute test7 t,
                        Model model) {
        model.addAttribute("d1", t.getData1());
        model.addAttribute("d2", t.getData2());
        return "test2";
    }

}
