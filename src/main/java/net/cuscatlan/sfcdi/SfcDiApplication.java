package net.cuscatlan.sfcdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.cuscatlan.sfcdi.controllers.ConstructorInyectionController;
import net.cuscatlan.sfcdi.controllers.I18nController;
import net.cuscatlan.sfcdi.controllers.MyController;
import net.cuscatlan.sfcdi.controllers.PropertyInyectionController;
import net.cuscatlan.sfcdi.controllers.SetterInyectionController;
import net.cuscatlan.sfcdi.examples.beans.FakeClassConnector;
import net.cuscatlan.sfcdi.examples.beans.FakeJmsConnector;

@SpringBootApplication
public class SfcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfcDiApplication.class, args);
		
		FakeClassConnector fakeClassConnector = ctx.getBean(FakeClassConnector.class);

		System.out.println(fakeClassConnector.getUsername());
		System.out.println(fakeClassConnector.getPassword());
		System.out.println(fakeClassConnector.getUrldb());
		
		FakeJmsConnector fakeJmsConnector = ctx.getBean(FakeJmsConnector.class);
		
		System.out.println(fakeJmsConnector.getUsername());
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println("--------------- i18n");
		System.out.println(i18nController.sayHello());
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("--------------- Primary");
		System.out.println(myController.sayHello());
		System.out.println("------------------- Property");
		PropertyInyectionController propertyInyectionController = (PropertyInyectionController) ctx
				.getBean("propertyInyectionController");
		System.out.println(propertyInyectionController.getGreeting());
		System.out.println("------------------- Setter");
		SetterInyectionController setterInyectionController = (SetterInyectionController) ctx
				.getBean("setterInyectionController");
		System.out.println(setterInyectionController.getGreeting());
		System.out.println("------------------- Constructor");
		ConstructorInyectionController constructorInyectionController = (ConstructorInyectionController) ctx
				.getBean("constructorInyectionController");
		System.out.println(constructorInyectionController.getGreeting());

	}

}
