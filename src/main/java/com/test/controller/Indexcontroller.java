package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * <p class="detail">
 * 功能：@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
 * </p>
 * @ClassName: Indexcontroller 
 * @version V1.0  
 * @date 2017-7-5 
 * @author wuxw
 * Copyright 2017 b-force.cn, Inc. All rights reserved
 */
@Controller
public class Indexcontroller {
	   @RequestMapping("/")
	   public String index(Model model){

	       model.addAttribute("name","Ryan");

	       return "index";
	   }
	   
	   
	   /**
		 * <p class="detail">
		 * 功能： 模板渲染 : 返回值"index"并非直接将字符串返回给浏览器，而是寻找名字为hello的(html)模板进行渲染 
		 * 自动寻找 在默认的模板文件夹src/main/resources/templates/ 一个模板文件hello.html 
		 * </p>
		 * @author wuxw
		 * @param model
		 * @return 
		 * @throws
		 */
	   @RequestMapping("/index")
	   public String index2(Model model){

	       model.addAttribute("name","Ryan");

	       return "index";
	   }
}
