package com.yijiang.service;

import com.github.pagehelper.PageInfo;
import com.yijiang.pojo.Emp;

import java.util.List;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-24
 * @Description: com.yijiang.service.impl
 */
public interface EmpService {

    List<Emp> selectAll();

    Boolean remove(Integer empno, String ename);
}
