package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.dao.CalificacionDAO;

@Service("calificacionService")
public class CalificacionService {
	@Autowired
	CalificacionDAO calificacionDAO;
	
}
