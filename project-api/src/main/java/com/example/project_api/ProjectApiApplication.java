package com.example.project_api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ProjectApiApplication {

    public static void main(String[] args) {
		SpringApplication.run(ProjectApiApplication.class, args);
	}

}