package br.edu.univas.si5.bd2;

import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.entities.Modelos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class ReadFabricante {
	public static void main(String[] args) {
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 2;
		Fabricante fab = em.find(Fabricante.class, pk);
		if(fab != null) {
			System.out.println("Fabricante Buscado: " + fab);
			Set<Modelos> modelos = fab.getModelos();
			System.out.println("Modelos do Fabricante: "+modelos);
			System.out.println("Detalhes do Fab: "+ fab.getDetalhes());
		} else {
			System.out.println("Fabricante não encontrado!");
		}
	}
}
