package net.cuscatlan.sfcdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import net.cuscatlan.sfcdi.examples.beans.FakeClassConnector;
import net.cuscatlan.sfcdi.examples.beans.FakeJmsConnector;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 12, 2020
 *
 */

@Configuration
//@PropertySource(value = {"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:jms.properties")
		})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value(value = "${net.cuscatlan.username}")
	String username;
	@Value(value = "${net.cuscatlan.password}")
	String password;
	@Value(value = "${net.cuscatlan.urldb}")
	String urldb;
	@Value(value = "${net.cuscatlan.jms.username}")
	String usernameJms;
	@Value(value = "${net.cuscatlan.jms.password}")
	String passwordJms;
	@Value(value = "${net.cuscatlan.jms.urldb}")
	String urldbJms;
	

	
	@Bean
	public FakeClassConnector fakeClassConnector() {
		FakeClassConnector fakeClassConnector = new FakeClassConnector();
		fakeClassConnector.setUsername(username);
		fakeClassConnector.setPassword(password);
		//fakeClassConnector.setUrldb(urldb);
		System.out.println(env);
		fakeClassConnector.setUrldb(env.getProperty("names"));
		return fakeClassConnector;
	}
	
	@Bean
	public FakeJmsConnector fakeJmsConnector() {
		FakeJmsConnector fakeJmsConnector = new FakeJmsConnector();
		fakeJmsConnector.setUsername(usernameJms);
		fakeJmsConnector.setPassword(passwordJms);
		fakeJmsConnector.setUrldb(urldbJms);
		return fakeJmsConnector;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	//	propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("datasource.properties"));
	// ambas formas son validas
		return propertySourcesPlaceholderConfigurer;
	}

}
