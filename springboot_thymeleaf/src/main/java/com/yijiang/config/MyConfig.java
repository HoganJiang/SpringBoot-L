package com.yijiang.config;

import com.yijiang.pojo.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-27
 * @Description: com.yijiang.config
 */
@Configuration
public class MyConfig {

    @Bean
    protected Emp getEmp1(){
        Emp emp = new Emp();
        emp.setEmpno(8901);
        emp.setEname("Jam");
        return emp;
    }

    @Bean("emp1")
    protected Emp getEmp2(){
        Emp emp = new Emp();
        emp.setEmpno(8902);
        emp.setEname("Alice");
        return emp;
    }



}
