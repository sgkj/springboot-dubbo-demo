package hello.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DubboDemoServiceI;
@Service(version="1.0.0")
public class DubboDemoServiceImpl implements DubboDemoServiceI {


	public String sayHello(String name) {
		// TODO Auto-generated method stub
	return "hello"+name;
	}

	public String sayYourAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
