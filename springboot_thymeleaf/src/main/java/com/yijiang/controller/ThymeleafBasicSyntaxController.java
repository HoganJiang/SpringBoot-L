package com.yijiang.controller;

import com.yijiang.pojo.Emp;
import com.yijiang.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-27
 * @Description: com.yijiang.controller
 */
@Controller
@RequestMapping("/Thymeleaf")
public class ThymeleafBasicSyntaxController {

    @Autowired
    private EmpServiceImpl empService;

    @RequestMapping("/text")
    public String testText(Map<String,String> map){
        map.put("msg","thymeleaf");
        return "t_basic_syntax";
    }

    @RequestMapping("/selectALL")
    public String selectAll(Map<String,Object> map){
        List<Emp> empList = empService.selectAll();
        map.put("empList",empList);
        map.put("emp",empList.get(0));
        map.put("emp",empList.get(1));
        return "t_basic_syntax";
    }

    @RequestMapping("/remove")
    public String remove(Integer empno, String ename){
        boolean result = empService.remove(empno,ename);
        return "redirect:selectALL";
    }

}
