package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Modelos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class RemoveModelos {
	public static void main(String[] args) {
		
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();

		int pk = 1;
		
		Modelos mod = em.find(Modelos.class, pk);
		if(mod != null) {
			em.getTransaction().begin();
			em.remove(mod);
			em.getTransaction().commit();
		} else {
			System.out.println("Modelo " + pk + " não encontrado.");
		}
	}
}
