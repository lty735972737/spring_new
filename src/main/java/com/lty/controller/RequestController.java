package com.lty.controller;

import com.lty.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试请求参数接受
 */
@RestController
public class RequestController {
    //原始方法
//    @RequestMapping("simpleParm")
//    public String simpleParm(HttpServletRequest request){
//        //获取请求参数
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "ok";
//    }

    //springboot方式
    @RequestMapping("simpleParm")
    public String simpleParm(@RequestParam(name = "name") String name, Integer age){
        System.out.println(name+":"+age);
        return "ok";
    }

    //2实体参数
    @RequestMapping("simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }
}
