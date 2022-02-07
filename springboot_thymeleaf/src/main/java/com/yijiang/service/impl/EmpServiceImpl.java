package com.yijiang.service.impl;

import com.yijiang.mapper.EmpMapper;
import com.yijiang.pojo.Emp;
import com.yijiang.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-24
 * @Description: com.yijiang.service.impl
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> selectAll() {
        return empMapper.selectAll();
    }

    @Override
    public Boolean remove(Integer empno, String ename) {
        return empMapper.remove(empno, ename) > 0? true:false;
    }
}
