package com.veena.devops.ws.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devopsworld")
public class DevOpsController {

	@RequestMapping(path="/welcome")
	public String welcome() {
		return "Lets start our DevOps Journey dear -Get Ready";
		
	}
}
