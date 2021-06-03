package com.springboot.zr.web.controller;

import com.springboot.zr.web.filter.MyHttpSessionListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhourui
 * @Date 2021/6/2 18:08
 */
@RestController
public class MyController {

    @GetMapping("/online")
    public String online() {
        return "当前在线人数: " + MyHttpSessionListener.online + "人";
    }
}
