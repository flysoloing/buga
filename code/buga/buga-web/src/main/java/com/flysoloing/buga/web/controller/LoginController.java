package com.flysoloing.buga.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <br>
 * User: flysoloing <br>
 * Date: 14-3-8 <br>
 * Time: 上午12:26
 */
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model,HttpServletResponse response) throws IOException {
        logger.info("login page");
        model.addAttribute("message", "欢迎进入支付前端系统后台管理系统");
        return "index";
    }
}
