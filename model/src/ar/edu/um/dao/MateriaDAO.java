package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("materiaDAO")
public class MateriaDAO implements IMateriaDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	//metodos
}
