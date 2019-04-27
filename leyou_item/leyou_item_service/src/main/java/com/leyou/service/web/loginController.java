package com.leyou.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Mr. Shaw
 * @Date 2019/1/14 - 15:24 -  2019
 * <p>
 * 你的假装努力，欺骗的只有你自己，永远不要用战术上的勤奋，
 * 来掩饰战略上的懒惰。 成长是一场和自己的比赛， 不要担心
 * 别人会做得比你好，你只需要每天都做得比前一天好就可以了。
 */
@Controller
public class loginController {

    @RequestMapping("/add")
    public String login(){
        return  "/user/add";
    }
}
