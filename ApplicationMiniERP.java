package com.ent.mini.erp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by mini erp 2020.
 */

@SpringBootApplication
@ComponentScan
//@EnableFeignClients({"com.ent.mini.erp.*"})
@EnableCaching
@EnableMongoRepositories({"com.ent.mini.erp.*"})
//@EnableSwagger2
// Using a root package also allows the @ComponentScan annotation to be used
// without needing to specify a basePackage attribute
public class ApplicationMiniERP implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(ApplicationMiniERP.class);

	public static void main(String[] args) throws Exception {

		SpringApplication.run(ApplicationMiniERP.class, args); // it wil start application

	}
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");

	}
}
