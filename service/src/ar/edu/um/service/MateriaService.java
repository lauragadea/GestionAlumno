package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.um.dao.MateriaDAO;
import ar.edu.um.model.Materia;

@Service("materiaService")
public class MateriaService {
	@Autowired
	MateriaDAO materiaDAO;
	
	//@Transactional
	//metodo
}
