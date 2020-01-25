package com.robomq;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robomq.config.AppConfig;
import com.robomq.dao.MobileDAO;
import com.robomq.pojo.Mobile;


public class MobileJDBCMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MobileDAO mobileDAO = context.getBean(MobileDAO.class);
		
		System.out.println("List of person is:");

		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		System.out.println("\nGet mobile with ID 4");

		Mobile mobileById = mobileDAO.getMobileById(4);
		System.out.println(mobileById);
		
		System.out.println("\nCreating MOBILE 	Entry: ");
		Mobile mobile = new Mobile(6, "Nokia", 15000, 2, "heyyy");
		System.out.println(mobile);
		mobileDAO.createMobile(mobile);
		System.out.println("\nList of mobile is:");

		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

		System.out.println("\nDeleting mobile with ID 2");
		mobileDAO.deleteMobile(mobileById);

		System.out.println("\nUpdate mobile with ID 5");

		Mobile mmobile = mobileDAO.getMobileById(5);
		mmobile.setName("fine");
		System.out.println(mmobile.getName());
		mobileDAO.updateMobile(mmobile);

		System.out.println("\nList of mobile is:");
		for (Mobile m : mobileDAO.getAllMobiles()) {
			System.out.println(m);
		}

	
		context.close();
	}

}
