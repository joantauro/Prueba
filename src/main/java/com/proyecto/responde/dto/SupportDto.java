package com.proyecto.responde.dto;

public class SupportDto {
	private String url;
	private String text;
	
	
	public SupportDto() {
	}

	public SupportDto(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
