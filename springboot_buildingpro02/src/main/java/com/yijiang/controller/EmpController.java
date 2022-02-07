package com.yijiang.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.yijiang.pojo.Emp;
import com.yijiang.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-24
 * @Description: com.yijiang.controller
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpServiceImpl empService;

    @RequestMapping("/selectALL")
    @ResponseBody
    public List<Emp> selectAll(){
        return empService.selectAll();
    }

    @RequestMapping("/selectByPage/{pageNum}/{pageSize}")
    @ResponseBody
    public PageInfo<Emp> selectByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize){
        return empService.selectByPage(pageNum,pageSize);
    }
}
