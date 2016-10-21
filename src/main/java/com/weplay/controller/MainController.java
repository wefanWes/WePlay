package com.weplay.controller;

import com.weplay.Pojo.User;
import com.weplay.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Wenbo on 16/10/19.
 */
@Controller
public class MainController {
    @Resource
    protected IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        User user = this.userService.getUserById("d4c774319ad04f38a124c0993fbc19a9");
        model.addAttribute("user",user);
        return "index";
    }
}