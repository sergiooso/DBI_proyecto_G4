package edu.unah.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="NumFactura",unique=true)
	private int NumFactura;
	
	private String Descripcion;
	private float Total_pagar;
	private String Direccion;
	private LocalDate Fecha_Actual;
	private float subtotal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IdPaciente")
	@JsonBackReference
	private Paciente paciente;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdTratamiento")
	@JsonBackReference
	private Tratamiento tratamiento;

	public Factura(String descripcion, float total_pagar, String direccion, LocalDate fecha_Actual,
			float subtotal, Paciente paciente, Tratamiento tratamiento) {
		super();
		
		Descripcion = descripcion;
		Total_pagar = total_pagar;
		Direccion = direccion;
		Fecha_Actual = fecha_Actual;
		this.subtotal = subtotal;
		this.paciente = paciente;
		this.tratamiento = tratamiento;
	}

	public int getNumFactura() {
		return NumFactura;
	}

	public void setNumFactura(int numFactura) {
		NumFactura = numFactura;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getTotal_pagar() {
		return Total_pagar;
	}

	public void setTotal_pagar(float total_pagar) {
		Total_pagar = total_pagar;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public LocalDate getFecha_Actual() {
		return Fecha_Actual;
	}

	public void setFecha_Actual(LocalDate fecha_Actual) {
		Fecha_Actual = fecha_Actual;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
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
