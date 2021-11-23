package com.proyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.proyecto.feign.client.ExternalApiClient;
import com.proyecto.responde.dto.ListadoDto;
import com.proyecto.responde.dto.PersonasDto;
import com.proyecto.responde.dto.SupportDto;
import com.proyecto.service.impl.ConsultaServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	@Mock
	private ExternalApiClient api;
	
	@InjectMocks
	private ConsultaServiceImpl consultaService;
	
	@Test
	public void test() {
		when(api.consultar()).thenReturn(new ListadoDto(1,6,12,2, lista(), new SupportDto()));
		assertEquals(4, consultaService.Prueba().size());
	}
	
	
	List<PersonasDto> lista(){
		List<PersonasDto> salida = new ArrayList<PersonasDto>();
		salida.add(new PersonasDto(1, "correo@gmail.com", "Joel", "Romero", "http://"));
		salida.add(new PersonasDto(2, "correo1@gmail.com", "Joel 1 ", "Romero", "http://"));
		salida.add(new PersonasDto(3, "correo2@gmail.com", "Joel 2", "Romero", "http://"));
		salida.add(new PersonasDto(4, "correo3@gmail.com", "Joel 3", "Romero", "http://"));
		return salida;
	}
	
}
