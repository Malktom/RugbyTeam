package pl.coderslab.RugbyTeam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan //will scan any servlet-related classes like as filters
public class RugbyTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RugbyTeamApplication.class, args);
	}

}
