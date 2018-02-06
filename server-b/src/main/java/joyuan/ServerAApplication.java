package joyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAApplication.class, args);
	}
}
