package com.wasai.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by SOUL
 * Date: 2019/7/31 16:58
 * 座右铭: 海阔凭鱼跃，天高任鸟飞
 */
@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
