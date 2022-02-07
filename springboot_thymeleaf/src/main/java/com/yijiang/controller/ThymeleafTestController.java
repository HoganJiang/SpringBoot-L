package com.yijiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-26
 * @Description: com.yijiang.controller
 */
@Controller
@RequestMapping("/Thymeleaf")
public class ThymeleafTestController {

    @RequestMapping("/testThymeleaf")
    public String testThymeLeaf(){
        return "t_test";
    }

}
