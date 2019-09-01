package com.bootstrapwithspringboot.webapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppContoller {

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
