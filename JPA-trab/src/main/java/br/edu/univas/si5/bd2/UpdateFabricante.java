package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class UpdateFabricante {
	public static void main(String[] args) {
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 1;
		Fabricante fab = em.find(Fabricante.class, pk);// busca o fabricante pela pk
		if (fab != null) {
			// se achar, faz update
			fab.setNome("Fabricante Update");
			fab.setCnpj("1-Update CNPJ");
			DetalhesFabricante det = em.find(DetalhesFabricante.class, 5);
			if(det != null) {
				fab.setDetalhes(det);
			} else {
				det = new DetalhesFabricante();
				det.setDataFund(new Date());
				det.setNumFunc(44);
				det.setCep("44");
		    	fab.setDetalhes(det);
			}
			em.getTransaction().begin();
			em.persist(det);
			em.merge(fab); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Modelo não encontrado para realizar o update - PK: "+pk);
		}
	}
}
