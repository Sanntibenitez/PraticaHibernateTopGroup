package com.tg.practice.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticeTest {
	private static Logger log = LoggerFactory.getLogger(PracticeTest.class);
	protected static SessionFactory sessionFactory;

	@BeforeClass
	public static void initialize() {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		log.info("Session factory creado correctamente");
		
		
		sessionFactory.close();
	}
	
	@Test
	public void test() {
		

	}
	


}
