package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entityclass.Employee;

public class insert {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_annotations");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee emp1=new Employee(1,"shubham",30000);
	Employee emp2=new Employee(2,"prince",40000);
	
	et.begin();
	em.persist(emp1);
	em.persist(emp2);
	et.commit();
	
}
}
