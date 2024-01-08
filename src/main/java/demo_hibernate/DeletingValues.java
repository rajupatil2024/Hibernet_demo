package demo_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingValues {

	public static void main(String[] args) {
				//Establish Connection
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
				//manage Entity Factory
				EntityManager manager=factory.createEntityManager();
				
				EntityTransaction transaction=manager.getTransaction();
				
				Student s=manager.find(Student.class,3);
				
				if(s!=null) {
					transaction.begin();
					manager.remove(s);
					transaction.commit();
				}
				else {
					System.out.println("Id is not found....");
				}

	}

}
