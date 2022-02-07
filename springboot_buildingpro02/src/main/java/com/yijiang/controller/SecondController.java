package com.yijiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-23
 * @Description: com.yijiang.controller
 */
@Controller
public class SecondController {

    @ResponseBody
    @RequestMapping("/secondController")
    public String secondController(){
        return "This is my second controller process.";
    }

}
