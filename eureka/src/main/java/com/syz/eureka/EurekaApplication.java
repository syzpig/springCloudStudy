package com.syz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer注解的作用是触发Spring Boot的自动配置机制，启动服务注册中心，由于我们之前在pom文件中导入了eureka-server，spring boot会在容器中创建对应的bean。
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
