package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.entities.Modelos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class ReadModelos {
	public static void main(String[] args) {
		
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		int pk = 2;
		Modelos mod = em.find(Modelos.class, pk);
		if(mod != null) {
			System.out.println("Modelo Buscado: " + mod);
			Fabricante fab = mod.getFabricante();
			if(fab != null) {
				System.out.println("Fabricante do Modelo buscado: "+fab);
			}
			DetalhesFabricante det = fab.getDetalhes();
			System.out.println(det);
		} else {
			System.out.println("Modelo não encontrado!");
		}
	}
}
