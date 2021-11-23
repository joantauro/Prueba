package com.proyecto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.feign.client.ExternalApiClient;
import com.proyecto.responde.dto.ListadoDto;
import com.proyecto.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{

	
	@Autowired
	ExternalApiClient api;
	
	@Override
	public List<String>  Prueba() {
		 ListadoDto lista =  api.consultar();
		 List<String> salida = new ArrayList<String>();
		 
		 for (int i = 0; i < lista.getData().size(); i++) {
			 StringBuilder sal = new StringBuilder();
			
			 sal.append(lista.getData().get(i).getId());
			 sal.append("|");
			 sal.append(lista.getData().get(i).getLast_name());
			 sal.append("|");
			 sal.append(lista.getData().get(i).getEmail());
			 
			 salida.add(sal.toString());
		}
		 
		return salida;
	}

}
