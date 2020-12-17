package com.clever.chen.springbootfirst.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenWang
 * @className HelloController
 * @date 2020/11/13 20:49
 * @since JDK 1.8
 */
//@Controller
@RestController
public class HelloController {
//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }


}
