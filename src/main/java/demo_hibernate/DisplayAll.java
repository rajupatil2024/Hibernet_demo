package demo_hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayAll {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
		
		EntityManager manager=factory.createEntityManager();
		
		Query q=manager.createQuery("select s from Student s");
		
		List<Student> list=q.getResultList();
		
		for(Student s : list)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
		}

	}

}
