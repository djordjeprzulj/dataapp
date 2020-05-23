package rs.inforce.dataapp;

import org.aspectj.weaver.ast.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rs.inforce.dataapp.beans.ExampleBean;
import rs.inforce.dataapp.beans.TestDatasource;

@SpringBootApplication
public class DataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DataAppApplication.class, args);

		TestDatasource testDatasource = ctx.getBean(TestDatasource.class);
		System.out.println(testDatasource);
/*
		ExampleBean eb1 = ctx.getBean(ExampleBean.class);
		ExampleBean eb2 = ctx.getBean(ExampleBean.class);

		if (eb1 == eb2) {
			System.out.println("Singleton");
		} else {
			System.out.println("Prototype");
		}
*/
	}
}
