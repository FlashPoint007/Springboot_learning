package com.dhu.controller;

import com.dhu.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

//请求处理类
@RestController
public class RequestController {
    //原始方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
////        获取请求参数
//        String name=request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":" +age);
//        return "OK";
//    }
//    springboot方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name,Integer age) {
//        System.out.println(name + ":" + age);
//        return "OK";
//    }
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name") String username, Integer age) {
        System.out.println(username + ":" + age);
        return "OK";
    }

    //    2.实体参数
    @RequestMapping("simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }

    //    数组集合参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }

    //    4.日期时间参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }

    //5.json格式的参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";

    }

    //    6.路径参数
    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + name);
        return "OK";
    }
}
