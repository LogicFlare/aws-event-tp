package api.lg.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AwsApplication.class, args);
		System.out.println("EVENT AWS IS RUNNING . . .");
	}

}
