package com.dhu.service.impl;

import com.dhu.dao.EmpDao;
import com.dhu.dao.impl.EmpDaoA;
import com.dhu.pojo.Emp;
import com.dhu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component /*控制反转*/
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
//        1.调用dao，获取数据
        List<Emp> emplist = empDao.listEmp();
        //        对数据进行处理-gender,job
        emplist.stream().forEach(emp -> {
            //处理gender
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            //处理job
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }

        });
        return emplist;
    }
}
