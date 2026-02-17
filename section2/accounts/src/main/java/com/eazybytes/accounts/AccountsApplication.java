package com.ayush.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ayush.accounts.controller") })
@EnableJpaRepositories("com.ayush.accounts.repository")
@EntityScan("com.ayush.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "AyushBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ayush Rastogi",
						email = "tutor@ayush.com",
						url = "https://www.ayush.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ayush.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "AyushBank Accounts microservice REST API Documentation",
				url = "https://www.ayush.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
