package com.FinanceTrack.FinanceAppML;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinanceAppMlApplication {

	private static final Logger log = LoggerFactory.getLogger(FinanceAppMlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FinanceAppMlApplication.class, args);
		log.info("Application started successfully!");
	}

	// Start Angular when Spring Boot starts
	@Bean
	public CommandLineRunner runAngular() {
		return args -> {
			ProcessBuilder builder = new ProcessBuilder();
			builder.command("cmd.exe", "/c", "cd \"../frontend\" && npm start");

			builder.inheritIO();
			Process process = builder.start();
		};
	}

	// @Bean
	// CommandLineRunner runner() { // Something executed after app is started and
	// the context is created
	// return args -> {
	// MoneyTransaction mf = new MoneyTransaction(1, 1000, LocalDateTime.now(),
	// "Test");
	// log.info("Transaction: " + mf);
	// };
	// }

}
