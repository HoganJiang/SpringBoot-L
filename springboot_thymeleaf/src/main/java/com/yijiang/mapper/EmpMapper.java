package com.yijiang.mapper;

import com.github.pagehelper.PageInfo;
import com.yijiang.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-24
 * @Description: com.yijiang.mapper
 */
@Mapper
public interface EmpMapper {
    List<Emp> selectAll();
    Integer remove(Integer empno, String ename);
}
