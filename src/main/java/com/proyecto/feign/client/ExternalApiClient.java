package com.proyecto.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.responde.dto.ListadoDto;


@FeignClient(name = "Api", url = "${external.url}")
public interface ExternalApiClient {

	@RequestMapping(method = RequestMethod.GET, value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    ListadoDto consultar();
}
