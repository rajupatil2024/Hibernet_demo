package demo_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayValues {

	public static void main(String[] args) {
		
		//Establish Connection
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
		
		//manage Entity Factory
		EntityManager manager=factory.createEntityManager();
		
		//Find the object is present or not
		Student s=manager.find(Student.class,2);
		
		if (s!=null)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
		}
		else {
			System.out.println("Id not found...");
		}

	}

}
