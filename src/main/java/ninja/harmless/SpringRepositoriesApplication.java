package ninja.harmless;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "ninja.harmless")
public class SpringRepositoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRepositoriesApplication.class, args);
	}
}

