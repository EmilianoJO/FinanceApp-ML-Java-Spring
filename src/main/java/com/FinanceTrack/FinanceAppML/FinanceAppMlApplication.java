package com.FinanceTrack.FinanceAppML;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceAppMlApplication {

	private static final Logger log = LoggerFactory.getLogger(FinanceAppMlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FinanceAppMlApplication.class, args);
		log.info("Application started successfully!");
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
