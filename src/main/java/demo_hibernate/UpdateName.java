package demo_hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateName {

	public static void main(String[] args) {
		//Establish Connection
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("raju");
				//manage Entity Factory
				EntityManager manager=factory.createEntityManager();
				
				EntityTransaction transaction=manager.getTransaction();
				
				
				Query q=manager.createQuery("select s from Student s");
				
				List<Student> list=q.getResultList();
				
				for(Student s : list)
				{
					if(s.getAge()>18)
					{
						int a=s.getId();
						Student s1=manager.find(Student.class,a);
						s.setName("Prakash");
						transaction.begin();
						//Merge to the Existing data (to update values)
						manager.merge(s1);
						transaction.commit();
					}
				}
			

	}
}
