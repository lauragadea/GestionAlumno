package ar.edu.um.service;

import java.math.BigDecimal;

import ar.edu.um.model.Aluleg;

public interface IAlulegService {
	
	public Aluleg findCarByPerID(BigDecimal IDDocumento);
}
