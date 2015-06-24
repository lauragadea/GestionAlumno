package ar.edu.um.service;

import java.math.BigDecimal;
import java.util.List;

import ar.edu.um.model.*;

public interface IPersonaService {

	void persistPersona(Persona persona);
	
	Persona findPersonaByPerID(BigDecimal IDDocumento);
	Persona validarLogin(BigDecimal login_id, String password);


}
