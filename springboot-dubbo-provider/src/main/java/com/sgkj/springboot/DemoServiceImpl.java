package com.sgkj.springboot;


import com.sgkj.springboot.DemoService;

public class DemoServiceImpl implements DemoService {



	@Override
	public String getUserName() {
		 System.out.println("Being invoked");
	        return "test user";
	}

}
