package com.bbva.macd.dto.departamento;

public enum Enums {
	Arquitectura("Arquitectura extendida","Torre Polanco","APX",35000),
	Marketing("Marketing","Torre Bancomer","MKT",45000),
	Servicios("Servicios","Torre Polanco","ASO",38000),
	contacto("Contacto comercial","oficinas beeva","COM",45000);
	
	private final String nombreDepartamento;
	private final String lugar;
	private final String clave;
	private final double sueldo;
	
	private Enums(String nombreDepartamento,String lugar,String clave,double sueldo){
		this.nombreDepartamento=nombreDepartamento;
		this.lugar=lugar;
		this.clave=clave;
		this.sueldo=sueldo;
	}
	
	
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	public String getLugar() {
		return lugar;
	}
	public String getClave() {
		return clave;
	}
	public double getSueldo() {
		return sueldo;
	}

}
