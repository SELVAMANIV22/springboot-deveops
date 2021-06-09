package com.newawsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessage {
	
	@GetMapping("/getmessage")
	public String getmessage()
	{
		return "welcome selvamani";
	}

}
