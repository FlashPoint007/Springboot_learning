package com.dhu.dao.impl;

import com.dhu.dao.EmpDao;
import com.dhu.pojo.Emp;
import com.dhu.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component /*ioc容器中的bean*/
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        //加载解析xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();//资源路径
        System.out.println(file);
        List<Emp> emplist = XmlParserUtils.parse(file, Emp.class);
        return emplist;
    }
}
