package com.ecom.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Product eProduct = context.getBean("Electronic", Product.class);
		eProduct.productDetails();
		eProduct.productType();

		Product eeProduct = context.getBean("Electronic1", Product.class);
		eeProduct.productDetails();
		eeProduct.productType();


		Product cProduct = context.getBean("Clothing", Product.class);
		cProduct.productDetails();
		cProduct.productType();
		
		

		context.close();


	}

}
