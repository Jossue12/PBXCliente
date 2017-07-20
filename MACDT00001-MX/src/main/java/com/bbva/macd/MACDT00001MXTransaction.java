package com.bbva.macd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bbva.macd.dto.cliente.Cliente;
import com.bbva.macd.dto.departamento.Departamento;

/**
 * TRANSACCION
 * Implementacion de logica de negocio.
 * @author administradorcito
 *
 */
public class MACDT00001MXTransaction extends AbstractMACDT00001MXTransaction {

	@Override
	public void execute() {
		Cliente clientedto= new Cliente();
		
		clientedto.setNombreCliente(this.getNombrecliente());
		SimpleDateFormat fn= new SimpleDateFormat("dd/MM/yyyy");
		Date fecha;
		try {
			fecha = fn.parse(this.getFechaingreso());
			clientedto.setFechaIngreso(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Departamento departamento = new GetDepartamento(this.getNombredepartamento()).getDepartamento();
		
		Departamento departamento = new Departamento(this.getNombredepartamento());
		clientedto.setDepartamento(departamento);
		this.setNombrecliente(clientedto.getNombreCliente());
		
		this.setFechaingreso(clientedto.getFechaIngreso().toString());
		this.setNombredepartamento(departamento.getNombre());
		this.setLugar(departamento.getLugar());
		this.setClave(departamento.getClave());
		this.setSueldo(String.valueOf(departamento.getSaldo()));
		
		
	}
	

}
