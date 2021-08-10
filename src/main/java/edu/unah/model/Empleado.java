package edu.unah.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TBL_EMPLEADO")
public class Empleado {

	@Id
	private int DniEmpleado;
	
	private String PriNombre;
	private String SegNombre;
	private String PriApellido;
	private String SegApellido;
	private String Telefono;
	private String Cargo;
	private String Sexo;
	private String Contrasenia;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IdSucursal")
	@JsonBackReference
	private Sucursal sucursal;

	
	public Empleado() {}

	public Empleado(int dniEmpleado, String priNombre, String segNombre, String priApellido, String segApellido,
			String telefono, String cargo, String sexo, String contrasenia, Sucursal sucursal) {
		super();
		this.DniEmpleado = dniEmpleado;
		this.PriNombre = priNombre;
		this.SegNombre = segNombre;
		this.PriApellido = priApellido;
		this.SegApellido = segApellido;
		this.Telefono = telefono;
		this.Cargo = cargo;
		this.Sexo = sexo;
		this.Contrasenia = contrasenia;
		this.sucursal=sucursal;
	}

	public int getDniEmpleado() {
		return DniEmpleado;
	}

	public void setDniEmpleado(int dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}

	public String getPriNombre() {
		return PriNombre;
	}

	public void setPriNombre(String priNombre) {
		PriNombre = priNombre;
	}

	public String getSegNombre() {
		return SegNombre;
	}

	public void setSegNombre(String segNombre) {
		SegNombre = segNombre;
	}

	public String getPriApellido() {
		return PriApellido;
	}

	public void setPriApellido(String priApellido) {
		PriApellido = priApellido;
	}

	public String getSegApellido() {
		return SegApellido;
	}

	public void setSegApellido(String segApellido) {
		SegApellido = segApellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
	
	
	
	
}
