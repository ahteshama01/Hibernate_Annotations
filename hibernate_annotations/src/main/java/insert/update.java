package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entityclass.Employee;

public class update {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_annotations");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee emp3=new Employee();
	emp3.setSalary(80000);
	et.begin();
	em.merge(emp3);
	et.commit();
}
}
