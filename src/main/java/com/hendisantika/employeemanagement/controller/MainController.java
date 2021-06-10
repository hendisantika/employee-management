package com.hendisantika.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-management
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/06/21
 * Time: 09.24
 */
@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    /*
     * @GetMapping("/") public String home() { return "index"; }
     */
}
