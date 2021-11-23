package com.proyecto.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.service.ConsultaService;

@RestController
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	
	
	@PostMapping(path = { "/consulta" }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Map<String, List<String>>> registrarBaseCronograma() {
		List<String> salida=	consultaService.Prueba();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("data", salida);
		return ResponseEntity.ok(map);
		}
}
