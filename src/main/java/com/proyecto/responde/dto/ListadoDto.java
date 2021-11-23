package com.proyecto.responde.dto;

import java.util.List;

public class ListadoDto {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<PersonasDto> data;
	private SupportDto support;
	
	public ListadoDto() {
	}
	
	public ListadoDto(int page, int per_page, int total, int total_pages, List<PersonasDto> data, SupportDto support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}



	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<PersonasDto> getData() {
		return data;
	}
	public void setData(List<PersonasDto> data) {
		this.data = data;
	}

	public SupportDto getSupport() {
		return support;
	}

	public void setSupport(SupportDto support) {
		this.support = support;
	}
	
	
	
}
