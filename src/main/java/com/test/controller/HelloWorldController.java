package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* Created by miaorf on 2016/6/19.
*/
@RestController
public class HelloWorldController {

   @RequestMapping("/hello")
   public Map<String,Object> json(){
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("name","Ryan");
       map.put("age","18");
       map.put("sex","man");
       return map;
   }
}