/**
 * 
 */
package com.cloud.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author CrazyCow
 *
 */
@Controller
@RequestMapping("test")
public class TestController {

	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("test");
		return "안녕하세요";
	}
	
}
