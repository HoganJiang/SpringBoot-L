package com.yijiang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-24
 * @Description: com.yijiang.pojo
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer empno;
    private String  ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;
    private Integer deptno;
}
