package ar.edu.um.dao;

import ar.edu.um.model.Carrera;

public interface ICarreraDAO {
	//definicion metodo
	Carrera findNombreCarreraByCarID(int IDCarrera); 
}
