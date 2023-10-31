package com.lxq.mybook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxq.mybook.dao")
public class MybookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybookApplication.class, args);
	}

}
