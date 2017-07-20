package com.bbva.macd.dto.cliente;

import java.util.Date;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.macd.dto.departamento.Departamento;


public class Cliente extends AbstractDTO {
    private static final long serialVersionUID = 2931699728946643245L;
    
    private String nombreCliente;
    private String apellidoCliente;
    private Date fechaIngreso;
    private Departamento departamento;
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoCliente == null) ? 0 : apellidoCliente.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (apellidoCliente == null) {
			if (other.apellidoCliente != null)
				return false;
		} else if (!apellidoCliente.equals(other.apellidoCliente))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", fechaIngreso="
				+ fechaIngreso + "]";
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
