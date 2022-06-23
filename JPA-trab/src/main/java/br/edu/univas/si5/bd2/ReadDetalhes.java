package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class ReadDetalhes {
	public static void main(String[] args) {
		
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 5;
		DetalhesFabricante det = em.find(DetalhesFabricante.class, pk);
		if(det != null) {
			System.out.println("Detalhe: " + det);
			Fabricante fab = det.getFabricante();
			if(fab != null) {
				System.out.println("Fabricante do objeto buscado: "+fab);
			}
		} else {
			System.out.println("Det não encontrado!");
		}
	}
}
