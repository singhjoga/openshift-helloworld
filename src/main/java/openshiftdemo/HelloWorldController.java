package openshiftdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @RequestMapping("hello")
    public String sayHello(){
    	
    	 InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
	         String ipAddress = addr.getHostAddress();    
	         String hostname = addr.getHostName();
	         
	         String hello = "Hello Everybody! I am at "+ipAddress+"  "+hostname;
	         return hello;
		} catch (UnknownHostException e) {
			throw new IllegalStateException(e);
		}
    }
}