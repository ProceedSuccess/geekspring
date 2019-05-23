package com.geekbrains.controllers;

import com.geekbrains.entities.User;
import com.geekbrains.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// auth vk(соцсети)
// к следующему занятию: регистрация + много доп кода
//

@Controller
public class MainController {
    // https://getbootstrap.com/docs/4.1/getting-started/introduction/csrf

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/hello")
    public String test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "index";
    }
    @RequestMapping("/user-role")
    public String userRole(Model model) {
        User user = new User();
        user.setUserName("vasia pupkin");
        model.addAttribute("user", user);
        return "user-role";
    }

    @Secured({"ROLE_ADMIN"})
    @RequestMapping("/onlyYou")
    @ResponseBody
    public String onlyYou() {
        return "index";
    }
}
