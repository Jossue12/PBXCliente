package com.bbva.macd.dto.departamento;

import com.bbva.apx.dto.AbstractDTO;

public class Departamento extends AbstractDTO{

    private static final long serialVersionUID = 2931699728946643245L;
	private String nombre, lugar, clave;
	private double saldo;
	
	public Departamento(String name){
			Enums enums = null;
			switch(name){
			 
			case"Arquitectura Extendida":
				enums = enums.Arquitectura;
				
				break;
			case"Marketing":
				enums = enums.Marketing;
				break;
			case "Servicios":
				enums = enums.Servicios;
				break;
			case "Contacto Comercial":	
			    enums = enums.contacto;
				break;
			default:
			}
			this.setNombre(enums.getNombreDepartamento());
			this.setLugar(enums.getLugar());
			this.setClave(enums.getClave());
			this.setSaldo(enums.getSueldo());	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (lugar == null) {
			if (other.lugar != null)
				return false;
		} else if (!lugar.equals(other.lugar))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", lugar=" + lugar + ", clave=" + clave + ", saldo=" + saldo + "]";
	}
	
}
