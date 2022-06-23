package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class UpdateDetalhes {
	public static void main(String[] args) {
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 2;
		
		
		DetalhesFabricante det = em.find(DetalhesFabricante.class, pk);// busca o fabricante pela pk
		if (det != null) {
			// se achar, faz update
			det.setCep("9090");
			det.setNumFunc(56);
			det.setDataFund(new Date());
			em.getTransaction().begin();
			em.merge(det); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Objeto não encontrado para realizar o update - PK: "+pk);
		}
	}
}
