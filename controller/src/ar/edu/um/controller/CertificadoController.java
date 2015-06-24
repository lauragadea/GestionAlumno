package ar.edu.um.controller;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Aluleg;
import ar.edu.um.model.Carrera;
import ar.edu.um.model.Certificado;
import ar.edu.um.model.Facultad;
import ar.edu.um.model.Persona;
import ar.edu.um.service.IAlulegService;
import ar.edu.um.service.ICarreraService;
import ar.edu.um.service.IFacultadService;
import ar.edu.um.service.IPersonaService;

@RestController
public class CertificadoController {
	 @RequestMapping(value = "/certificado/{IDDocumento}", method = RequestMethod.GET)
	    public Certificado crear(@PathVariable("IDDocumento") BigDecimal IDDocumento) {
	    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    	//supongamos que ya tengo el dni
	    
	    	ICarreraService carService = (ICarreraService) context.getBean("carreraService");
	    	IAlulegService aluService = (IAlulegService) context.getBean("alulegService");
			IPersonaService perService = (IPersonaService) context.getBean("personaService");
	    	IFacultadService facService = (IFacultadService) context.getBean("facultadService");
			
			Aluleg aluleg = aluService.findCarByPerID(IDDocumento);
	    	
	    	Facultad facultad = facService.findNombreByFacID(aluleg.getIDFacultad());
	    	
	    	Carrera carrera = carService.findNombreCarreraByCarID(aluleg.getALe_Car_ID());
	    	
	    	Persona persona = perService.findPersonaByPerID(IDDocumento);
	    	System.out.println("aluleg = " + aluleg);
	    	System.out.println("facultad = " + facultad);
	    	System.out.println("carrera = " + carrera);
	    	System.out.println("persona = " + persona);
	    		    	
	    	Certificado certificado = new Certificado();
	    	certificado.setDNI(IDDocumento);
	    	
	    	certificado.setCarrera(carrera.getNombre()); 
	    	certificado.setFacultad (facultad.getFac_Nombre());
	    	certificado.setNombre (persona.getNombre());
	    	certificado.setApellido (persona.getApellido());
	    	certificado.setAnhoCursado (2015);
	    	
	    	return certificado;
	    }
   
}
