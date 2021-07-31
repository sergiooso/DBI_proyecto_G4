package edu.unah.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Factura")
public class Factura {
	
	@Id
	private int Id_Factura;
	private String Descripcion;
	private float Total_Pagar;
	private String Direccion;
	private Date Fecha_Actual;
	private float Subtotal;
	
	@OneToOne
	@JoinColumn (name="Id_Paciente")
	@JsonBackReference
	private Paciente paciente;
	
	@OneToOne
	@JoinColumn (name="Id_Tratamiento")
	@JsonBackReference
	private Tratamiento tratamiento;

	public Factura(int id_Factura, String descripcion, float total_Pagar, String direccion, Date fecha_Actual,
			float subtotal, Paciente paciente, Tratamiento tratamiento) {
		super();
		Id_Factura = id_Factura;
		Descripcion = descripcion;
		Total_Pagar = total_Pagar;
		Direccion = direccion;
		Fecha_Actual = fecha_Actual;
		Subtotal = subtotal;
		this.paciente = paciente;
		this.tratamiento = tratamiento;
	}

	public int getId_Factura() {
		return Id_Factura;
	}

	public void setId_Factura(int id_Factura) {
		Id_Factura = id_Factura;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getTotal_Pagar() {
		return Total_Pagar;
	}

	public void setTotal_Pagar(float total_Pagar) {
		Total_Pagar = total_Pagar;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Date getFecha_Actual() {
		return Fecha_Actual;
	}

	public void setFecha_Actual(Date fecha_Actual) {
		Fecha_Actual = fecha_Actual;
	}

	public float getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(float subtotal) {
		Subtotal = subtotal;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	
}
