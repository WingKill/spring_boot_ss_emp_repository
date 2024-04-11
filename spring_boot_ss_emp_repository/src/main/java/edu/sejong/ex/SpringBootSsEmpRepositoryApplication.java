package edu.sejong.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"edu.sejong.ex.mapper"})
@SpringBootApplication
public class SpringBootSsEmpRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSsEmpRepositoryApplication.class, args);
	}

}
