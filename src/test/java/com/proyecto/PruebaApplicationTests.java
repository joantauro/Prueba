package com.proyecto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

 

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PruebaApplicationTests {

	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test
	void estadoOk() {
		String url="/consulta"; 

		ResponseEntity<String> response = devolverResponsePOST(url);
		assertThat(HttpStatus.OK).isEqualTo(response.getStatusCode());
	}
	
	@Test
	void tamañoArreglo() {
		String url="/consulta"; 
		ResponseEntity<String> response = devolverResponsePOST(url);

		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson( response.getBody(), JsonObject.class);
		JsonElement jsonElement = jsonObject.get("data");
		List<String> resp= gson.fromJson(jsonElement, ArrayList.class);
		assertThat(6).isEqualTo(resp.size());
	}
	
	
	
	
	
	ResponseEntity<String> devolverResponsePOST(String url){

		HttpEntity<String> entity = new HttpEntity<String>("");
		ResponseEntity<String> response =  restTemplate.exchange(
				url, HttpMethod.POST, entity, String.class);
		
		
		return response;
	}

}
