package com.github.pzzls;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C) 2017 mosl, Inc.
 * <p>内容摘要： </p>
 * <p>其他说明： </p>
 *
 * @author <a> href="mailto:moshenglei@icloud.com">mosl</a>
 * @since 2017/2/16 下午12:32
 */

@Controller
public class LoginController {

    @RequestMapping("/testJsp")
    public String testJsp() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            user.login(token);
        } catch (AuthenticationException e) {
            token.clear();
            request.setAttribute("error", "用户或密码不正确！");
            return "redirect:/error";
        }
        //这里可以多加几个catch异常，密码或账号为空等等．．
        //这里一定需要方法重定向，否则刷新又回到登陆页面了
        return "redirect:index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    @RequiresPermissions("showStore")
    @RequestMapping("/showStores")
    public String showStores() {
        return "showStore";
    }


}
