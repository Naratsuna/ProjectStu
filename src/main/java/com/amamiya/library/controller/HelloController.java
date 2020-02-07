package com.amamiya.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//使用@RestController来声明我们新创建的HelloWordController是一个访问控制器
//在MVC的开发过程中，我们经常需要通过Controller将数据传递到页面中，让页面进行动态展示
@RestController
@RequestMapping//默认路径8080
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "HelloWorld";
    }
}
