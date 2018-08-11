package jsjzx.wlyw.sb004;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="jsjzx.wlyw.sb004.mapper")
@SpringBootApplication
public class Sb004Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb004Application.class, args);
	}
}
