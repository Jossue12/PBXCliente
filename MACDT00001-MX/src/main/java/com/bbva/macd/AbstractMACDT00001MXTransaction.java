package com.bbva.macd;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractMACDT00001MXTransaction extends AbstractTransaction {

	public AbstractMACDT00001MXTransaction(){
	}
	/**
	 * Return value for input parameter nombreCliente
	 */
	protected String getNombrecliente()
	{
		return (String)getParameter("nombreCliente");
	}
	/**
	 * Return value for input parameter fechaIngreso
	 */
	protected String getFechaingreso()
	{
		return (String)getParameter("fechaIngreso");
	}
	/**
	 * Return value for input parameter nombreDepartamento
	 */
	protected String getNombredepartamento()
	{
		return (String)getParameter("nombreDepartamento");
	}
	
	

	
	/**
	 * Set value for output parameter nombreCliente
	 */
	protected void setNombrecliente(final String field)
	{
		this.addParameter("nombreCliente", field);
	}
	/**
	 * Set value for output parameter fechaIngreso
	 */
	protected void setFechaingreso(final String field)
	{
		this.addParameter("fechaIngreso", field);
	}
	/**
	 * Set value for output parameter nombreDepartamento
	 */
	protected void setNombredepartamento(final String field)
	{
		this.addParameter("nombreDepartamento", field);
	}
	/**
	 * Set value for output parameter lugar
	 */
	protected void setLugar(final String field)
	{
		this.addParameter("lugar", field);
	}
	/**
	 * Set value for output parameter clave
	 */
	protected void setClave(final String field)
	{
		this.addParameter("clave", field);
	}
	/**
	 * Set value for output parameter sueldo
	 */
	protected void setSueldo(final String field)
	{
		this.addParameter("sueldo", field);
	}
	

}
