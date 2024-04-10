package com.dhu.controller;

import com.dhu.pojo.Address;
import com.dhu.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    /*@RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello!");
        return "Hello!";
    }
    @RequestMapping("/getAddress")
    public Address getAddr(){
        Address addr = new Address();
        addr.setCity("深圳");
        addr.setProvince("广东");
        return addr;

    }
    @RequestMapping("/listAddress")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();
        Address addr=new Address();
        addr.setProvince("上海");
        addr.setCity("松江");

        Address addr2 = new Address();

        addr2.setProvince("北京");
        addr2.setCity("常州");

        list.add(addr);
        list.add(addr2);
        return list;

    }*/
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello!");
//        return new Result(1,"success","Hello!");
        return Result.success("Hello!");
    }

    @RequestMapping("/getAddress")
    public Result getAddr() {
        Address addr = new Address();
        addr.setCity("深圳");
        addr.setProvince("广东");
//        return addr;
        return Result.success(addr);
    }

    @RequestMapping("/listAddress")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("上海");
        addr.setCity("松江");

        Address addr2 = new Address();

        addr2.setProvince("北京");
        addr2.setCity("常州");

        list.add(addr);
        list.add(addr2);
//        return list;
        return Result.success(list);
    }
}
