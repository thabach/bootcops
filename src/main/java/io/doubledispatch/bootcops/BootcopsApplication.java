package io.doubledispatch.bootcops;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.doubledispatch.bootcops.orm.jpa.InMemoryUniqueIdGenerator;
import io.doubledispatch.bootcops.orm.jpa.UniqueIdGenerator;

@SpringBootApplication
public class BootcopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcopsApplication.class, args);
	}

	@Bean
	public UniqueIdGenerator<UUID> uniqueIdGenerator() {
		return new InMemoryUniqueIdGenerator();
	}

}
