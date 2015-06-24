package ar.edu.um.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.PersonaDAO;
import ar.edu.um.model.Persona;
import ar.edu.um.model.RespuestaJSONLogin;

@Service("personaService")
public class PersonaService implements IPersonaService {
	
	@Autowired
	PersonaDAO personaDAO;

	@Transactional 
	public void persistPersona (Persona persona) {
		personaDAO.persistPersona (persona);
	}

	
	@Transactional 
	public Persona findPersonaByPerID(BigDecimal IDDocumento) {
		return (Persona)personaDAO.findPersonaByPerID(IDDocumento);
	}

	@Transactional
	public Persona validarLogin(BigDecimal Per_ID, String Per_Contrasenha) {
		
		return (Persona)personaDAO.validarLogin(Per_ID, Per_Contrasenha);
	}

}
