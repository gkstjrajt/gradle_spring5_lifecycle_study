package gradle_spring5_lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import gradle_spring5_lifecycle.spring.Client2;

@Configuration
@ComponentScan(basePackages = {"gradle_spring5_lifecycle.spring"})
public class AppCtx {
	
	@Bean(initMethod= "connect", destroyMethod= "close")
	public Client2 client2() {
		return new Client2();
	}
	
}
