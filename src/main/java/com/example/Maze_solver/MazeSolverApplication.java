package com.example.Maze_solver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MazeSolverApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(MazeSolverApplication.class);
		builder.headless(false);
		NewClass view = new NewClass();
		view.setVisible(true);
	}

}
