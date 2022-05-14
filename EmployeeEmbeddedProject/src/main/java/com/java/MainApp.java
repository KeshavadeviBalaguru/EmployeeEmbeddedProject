package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {

		Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction t= session.beginTransaction();
		 
		 Address ad=new Address("Pondicherry","India",609609);
		 
		 Employee e=new Employee(101,"Anutha",ad);
		 session.save(e);
		 t.commit();
		 session.close();
		 
		 

	}

}
