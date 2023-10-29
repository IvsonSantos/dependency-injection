package com.example.dependencyinjection;

import com.example.dependencyinjection.config.Config;
import com.example.dependencyinjection.service.MySpringBeanWithDependency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyinjectionApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MySpringBeanWithDependency springBean = context.getBean(MySpringBeanWithDependency.class);
		springBean.run();
		context.close();
	}

}
