package com.cesarpa.controllers;

import com.cesarpa.models.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien alien) {
        var mv = new ModelAndView();
        mv.addObject("obj", alien);

        mv.setViewName("home");
        return mv;
    }
}
