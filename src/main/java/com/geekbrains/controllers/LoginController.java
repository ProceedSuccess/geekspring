package com.geekbrains.controllers;

import com.geekbrains.entities.User;
import com.geekbrains.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;


@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){this.userService = userService;}

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showMyLoginPage( Model model, HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        System.out.println(principal.getName());
       // Principal principal = request.getUserPrincipal();
      //  System.out.println(principal.getName());
     //   User user = us.findByUserName(principal.getName());
      //  String user_name = user.getUserName();
      //  System.out.println(user_name);
     //   model.addAttribute("username",user_name);
        return "modern-login";
    }
//    @PostMapping("/login")
//    public String logIn(@RequestParam("username") String name, Model model) {
//
//     //   model.addAttribute("username",mo);
//        return "modern-login";
//    }
    @GetMapping("/accessDenied")
    public String showAccessDeniedPage() {
        return "access-denied";
    }

//    @GetMapping("/ohSh")
//    public String ohSh() {
//        return "plain-login";
//    }
}
