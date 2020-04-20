package com.woniu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//启动事务管理
@EnableTransactionManagement
//包扫描，生成下面这个包所有的Dao或者Mapper接口实现类
@MapperScan("com.woniu.springboot.mapper")
@SpringBootApplication
public class Springssm01Application {

	public static void main(String[] args) {
		System.out.println("cccc");
		System.out.println("thy");
		SpringApplication.run(Springssm01Application.class, args);
	}

}
