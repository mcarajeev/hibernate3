package com.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Dept;
import com.beans.Employee;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee();
		Dept dept = new Dept();
		Set<Employee> set = new HashSet<Employee>();
		set.add(employee);

		dept.setDeptno(11);
		dept.setDname("mca");
		dept.setLoc("sbp");
		dept.setSet(set);
		session.save(dept);

		employee.setEmpno(1);
		employee.setUserName("rajeev");
		employee.setDept(dept);
		session.save(employee);
		
		transaction.commit();
		session.close();
	}
}
