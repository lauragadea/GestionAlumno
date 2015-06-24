package ar.edu.um.controller;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import ar.edu.um.model.Persona;
import ar.edu.um.model.RespuestaJSON;
import ar.edu.um.model.RespuestaJSONLogin;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

	static final String AB = "0123456789abcdefghijklmnopkrstuvwxyz";
	static Random rnd = new Random();

	String randomString( int len ) 
	{
	   StringBuilder sb = new StringBuilder( len );
	   for( int i = 0; i < len; i++ ) 
	      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	   return sb.toString();
	}
	
	/** 
	 * Parámetros:
	 * ▪ login_id (GET) Identificador del usuario para el acceso a servicios privados.
	 * ▪password (GET) Contraseña de la cuenta de usuario.
	 * Url: https://<base_url>/login/login_id/password
	 * Devuelve: Json con los siguientes atributos:
	 * ▪ status: <status code>
	 * ▪ session_token: Token de sesión para el acceso a los métodos privados
	 * 
	 **/
	@RequestMapping(value = "/login/{login_id}/{password}", method = RequestMethod.GET)
	public RespuestaJSONLogin login(@PathVariable("login_id") BigDecimal login_id, @PathVariable("password") String password){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		
		Persona persona = perService.validarLogin(login_id, password);
		System.out.println(persona);
		RespuestaJSONLogin respuesta = new RespuestaJSONLogin();
		
		if (persona == null){
			respuesta.setStatus(-1);
		}else{

			respuesta.setStatus(200);
			String rand = randomString(30);
			
			respuesta.setSession_token(rand);
		}
		
		
		return respuesta;
	}
	
	
	
 
}
