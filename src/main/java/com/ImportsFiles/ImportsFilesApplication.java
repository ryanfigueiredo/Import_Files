package com.ImportsFiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ImportsFiles.Controllers")
public class ImportsFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportsFilesApplication.class, args);
	}

}
