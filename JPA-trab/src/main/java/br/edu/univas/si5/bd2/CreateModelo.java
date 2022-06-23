package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Fabricante;
import br.edu.univas.si5.bd2.entities.Modelos;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class CreateModelo {
	public static void main(String[] args) {
		
		Modelos modelo = new Modelos();
		modelo.setNome("Novo Modelo");
		modelo.setPeso(24f);
		modelo.setTipo("Vintage");
		EntityManager em;
    	em = HibernateUtil.getEntityManager();
    	
    	Fabricante fab = em.find(Fabricante.class, 2); // pk = 1
    	if(fab != null) {
    		modelo.setFabricante(fab);
    		em.getTransaction().begin();//inicia a transação
	    	em.persist(modelo);
	    	em.getTransaction().commit();//finaliza a transação
    	}else {
    		System.out.println("Fabricante ainda não foi criado");
    	}
	}
}
