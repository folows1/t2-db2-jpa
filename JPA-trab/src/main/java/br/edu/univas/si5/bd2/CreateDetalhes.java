package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.DetalhesFabricante;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateDetalhes {
	public static void main(String[] args) {
		DetalhesFabricante det = new DetalhesFabricante();
		det.setCep("333");
		det.setDataFund(new Date());
		det.setNumFunc(20);
		
		
		EntityManager em;
    	em = HibernateUtil.getEntityManager();
    	
    	em.getTransaction().begin();//inicia a transação
    	em.persist(det);
    	em.getTransaction().commit();//finaliza a transação
	}
}
