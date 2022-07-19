/**
 * 
 */
package com.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.study.dto.TestDataDTO;
import com.cloud.study.service.TestDataService;

/**
 * @author CrazyCow
 *
 */
@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	TestDataService service;
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("test");
		return "안녕하세요";
	}
	
	@RequestMapping("test2/{id}")
	@ResponseBody
	public TestDataDTO getData(@PathVariable(name = "id") Long id) {
		System.out.println("get data");
		return service.getData(id);
	}
	
}
