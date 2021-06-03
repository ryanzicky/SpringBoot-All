package com.springboot.zr.web.controller;

import com.springboot.zr.web.filter.MyHttpSessionListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zhourui
 * @Date 2021/6/2 13:50
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello,Springboot");
        return "hello";
    }
}
