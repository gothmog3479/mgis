package ru.gothmog.isogd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gothmog on 21.01.2017.
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Hi My First, Ich Libe thymeleaf");
        return "hello";
    }

}
