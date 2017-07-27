package com.jennbowers.firstspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//    model is like a hash map
//    each param is pulling from the browser, value corresponds with name
    @RequestMapping("/")
    public String index(@RequestParam(value = "data", required = false) String data,
                        @RequestParam(value = "lastname", required = false) String lastname,
                        ModelMap model) {
        System.out.println(data);
        System.out.println(lastname);
        model.addAttribute("pageData", data + " " + lastname);
        return "index";
    }
}
