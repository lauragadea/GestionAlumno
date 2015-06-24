package ar.edu.um.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Persona;

@Service("personaDAO")
public class PersonaDAO implements IPersonaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistPersona(Persona persona) {
		sessionFactory.getCurrentSession().persist(persona);
	}
	


	public Persona findPersonaByPerID(BigDecimal IDDocumento) {
		Query query = sessionFactory.getCurrentSession().createQuery("from Persona where IDDocumento=:IDDocumento ");
		 query.setParameter("IDDocumento", IDDocumento);
		 Persona persona = (Persona) query.uniqueResult();
		 
		 return persona;
		 
	
	
	}
	public Persona validarLogin(BigDecimal Per_ID, String Per_Contrasenha) {
		Query query = sessionFactory.getCurrentSession().createQuery("from Persona where Per_ID=:Per_ID and Per_Contrasenha=:Per_Contrasenha");
		query.setParameter("Per_ID", Per_ID);
		query.setParameter("Per_Contrasenha", Per_Contrasenha);
		
		Persona persona = (Persona) query.uniqueResult();
		
		return persona;
	}

}