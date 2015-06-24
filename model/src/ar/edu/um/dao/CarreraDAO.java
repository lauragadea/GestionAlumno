package ar.edu.um.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Carrera;

@Service("carreraDAO")
public class CarreraDAO implements ICarreraDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Carrera findNombreCarreraByCarID(int IDCarrera){
		Query query = sessionFactory.getCurrentSession().createQuery("from Carrera where IDCarrera = :IDCarrera");
		query.setParameter("IDCarrera", IDCarrera);
	

		Carrera carrera = (Carrera) query.uniqueResult();
		 
		if (carrera == null){
			throw new RuntimeException("No se encontró id de carrera: " + IDCarrera);
		}
			
		return carrera;
	}
}
