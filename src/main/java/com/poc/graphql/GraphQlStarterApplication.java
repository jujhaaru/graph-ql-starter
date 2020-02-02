package com.poc.graphql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GraphQlStarterApplication implements CommandLineRunner {

	private static final Logger LOG= LoggerFactory.getLogger("GraphQlStarterApplication.class");

	public static void main(String[] args) {
		SpringApplication.run(GraphQlStarterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Running the applicaion with MongoDB and GraphQl");
	}
}
