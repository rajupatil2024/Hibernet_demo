package demo_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertingValues {

	public static void main(String[] args) {
		
		//Establish Connection
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("raju");
		
		//manage Entity Factory
		EntityManager manager=factory.createEntityManager();
		
		//whenever Transaction is going to happen
		EntityTransaction transaction=manager.getTransaction();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Raju");
		s1.setAge(24);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Nags");
		s2.setAge(22);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Manoj");
		s3.setAge(22);
		
		//Transaction starts
		transaction.begin();
		
		//it will convert insert into Query
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);
		
		transaction.commit();
		
	}

}
