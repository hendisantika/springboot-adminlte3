package com.hendisantika.springbootadminlte3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-adminlte3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/11/20
 * Time: 08.41
 */
@Controller
public class AdminPageController {

    @RequestMapping({"/admin/dashboard", "/admin"})
    public String dashboard() {
        return "admin/dashboard";
    }

    @RequestMapping({"/admin/user/list", "/admin/user"})
    public String listUser() {
        return "admin/user-list";
    }

    @RequestMapping("/admin/user/add")
    public String addUser() {
        return "admin/user-add";
    }

}
