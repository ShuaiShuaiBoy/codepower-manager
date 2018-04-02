package cn.com.codepower.run;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"cn.com.codepower"})
@MapperScan("cn.com.codepower.*.dao")
public class CodepowerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodepowerManagerApplication.class, args);
	}
}
