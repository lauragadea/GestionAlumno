package ar.edu.um.dao;

import java.math.BigDecimal;
import java.util.List;

import ar.edu.um.model.Persona;

public interface IPersonaDAO {
	void persistPersona (Persona persona);

	Persona findPersonaByPerID (BigDecimal Per_ID);
	Persona validarLogin(BigDecimal login_id, String password);
}