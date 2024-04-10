package com.dhu.controller;

import com.dhu.pojo.Emp;
import com.dhu.pojo.Result;
import com.dhu.service.EmpService;
import com.dhu.service.impl.EmpServiceA;
import com.dhu.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
/*        //加载解析xml
        String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();//资源路径
        System.out.println(file);
        List<Emp> emplist = XmlParserUtils.parse(file, Emp.class);
//        对数据进行处理-gender,job
        emplist.stream().forEach(emp -> {
            //处理gender
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            //处理job
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }

        });
//        3.响应数据
        return Result.success(emplist);*/

//        1. 调用Service获取数据
        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }
}
