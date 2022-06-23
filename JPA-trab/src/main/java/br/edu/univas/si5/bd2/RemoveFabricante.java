package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class RemoveFabricante {
	public static void main(String[] args) {
		
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		int pk = 1;
		
		Fabricante fab = em.find(Fabricante.class, pk);
		if(fab != null) {
			em.getTransaction().begin();
			em.remove(fab);
			em.getTransaction().commit();
		}else {
			System.out.println("Fabricante "+pk+" não encontrado!");
		}
	}
}
