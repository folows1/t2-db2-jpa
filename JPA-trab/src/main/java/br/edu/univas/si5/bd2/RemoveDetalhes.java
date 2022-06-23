package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class RemoveDetalhes {

	public static void main(String[] args) {

		EntityManager em;
		em = HibernateUtil.getEntityManager();

		int pk = 4;
		
		
		DetalhesFabricante det = em.find(DetalhesFabricante.class, pk);
		if (det != null) {
			em.getTransaction().begin();
			em.remove(det);
			em.getTransaction().commit();
		} else {
			System.out.println("Detalhe " + pk + " não encontrado.");
		}
	}
}
