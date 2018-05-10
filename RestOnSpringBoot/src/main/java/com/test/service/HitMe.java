/**
 * 
 */
package com.test.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kapbaksh
 *
 */

@RestController
@EnableAutoConfiguration
public class HitMe {

	@RequestMapping("/")
	public String test(){
		return "tested and verified!!!";
	}
}
