package com.fenma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 * <p>
 *
 * @author 陈冕
 * @version 1.0.0
 * @date 2018/9/7
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping("/index")
    public String Index(){
        return  "ssssss";
    }

}
