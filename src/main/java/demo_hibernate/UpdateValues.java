package demo_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateValues {

	public static void main(String[] args) {
		//Establish Connection
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
		//manage Entity Factory
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		
		Student s=manager.find(Student.class,3);
		
		if(s!=null) {
			s.setName("Hemanth");
			s.setAge(23);
			transaction.begin();
			//Merge to the Existing data (to update values)
			manager.merge(s);
			transaction.commit();
		}
		else {
			System.out.println("Id not found...");
		}

	}

}
