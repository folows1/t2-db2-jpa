package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Modelos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class UpdateModelo {
	public static void main(String[] args) {
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 1;
		Modelos mod = em.find(Modelos.class, pk);// busca o fabricante pela pk
		if (mod != null) {
			// se achar, faz update
			mod.setNome("Update Modelo - 1");
			mod.setPeso(21f);
			mod.setTipo("tipo update");
			em.getTransaction().begin();
			em.merge(mod); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Modelo não encontrado para realizar o update - PK: "+pk);
		}
	}
}
