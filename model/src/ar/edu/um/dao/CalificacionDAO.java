package ar.edu.um.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("calificacionDAO")
public class CalificacionDAO implements ICalificacionDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	//metodos
}
