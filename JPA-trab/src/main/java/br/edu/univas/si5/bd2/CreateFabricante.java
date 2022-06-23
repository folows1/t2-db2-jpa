package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateFabricante {
	public static void main(String[] args) {
		DetalhesFabricante det = new DetalhesFabricante();
		det.setCep("33");
		det.setNumFunc(11);
		det.setDataFund(new Date());
		
		Fabricante fab = new Fabricante();
		fab.setAtivo(false);
		fab.setNome("FAB1");
		fab.setCnpj("1101");
		fab.setDetalhes(det);
		
		EntityManager em;
    	em = HibernateUtil.getEntityManager();
    	
    	em.getTransaction().begin();//inicia a transação
    	em.persist(det);
    	em.persist(fab);
    	em.getTransaction().commit();//finaliza a transação
	}
}
