package aplication;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

	public static void main(String[] args) {


//	inserção	Pessoa p1 = new Pessoa("Carlos","carlos@gmail.com");
//	inserção	Pessoa p2 = new Pessoa("Joaquim","joaquim@gmail.com");
//	inserção	Pessoa p3 = new Pessoa("Ana","ana@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exe");
		EntityManager em = emf.createEntityManager();


//	inserção	em.getTransaction().begin();
//	inserção	em.persist(p1);
//	inserção	em.persist(p2);
//	inserção	em.persist(p3);
//	inserção	em.getTransaction().commit();
//	inserção	System.out.println("ok");

//	Pesquisa	Pessoa p1 = em.find(Pessoa.class, 2);
//	Pesquisa	System.out.println(p1);

//	exclusão	em.getTransaction().begin();
//	exclusão	Pessoa p1 = em.find(Pessoa.class, 1);
//	exclusão	em.remove(p1);
//	exclusão	em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
