/**
 * 
 */
package org.colin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Colin
 *
 */
@Controller
@RequestMapping("/mvc")
public class helloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

}
