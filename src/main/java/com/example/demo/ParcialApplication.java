package edu.eci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
//@ComponentScan("edu.eci")
public class ParcialApplication {

	public static void main(String[] args) {
		System.out.println("holaaaa" +
				"");
		SpringApplication.run(ParcialApplication.class, args);
	}


}
