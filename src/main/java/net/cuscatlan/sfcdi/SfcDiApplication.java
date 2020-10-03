package net.cuscatlan.sfcdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.cuscatlan.sfcdi.controllers.MyController;

@SpringBootApplication
public class SfcDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfcDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		
	}

}
