package com.waghmare.dhiraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.waghmare.dhiraj.dao.User;

@Controller
public class UserController {

    @GetMapping("/UserReg")
    public ModelAndView showRegistrationPage() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("UserReg");

        return mv;
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("user") User user) {

        System.out.println(user);

        ModelAndView mv = new ModelAndView();
        mv.addObject(user);
        mv.setViewName("result");

        return mv;
    }
}