package com.yijiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-25
 * @Description: com.yijiang.controller
 */
@Controller
@RequestMapping("/freemarker")
public class FreeMarkerController {

    @RequestMapping("/showfreemarker")
    public String show(Map<String, String> map){
        map.put("num","first");
        return "freemarker";
    }

}
