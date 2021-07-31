package edu.unah.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Empleado")
public class Empleado {
	
	@Id
	private int Dni_Empleado;
	
	private String Pri_Nombre;
	private String Seg_Nombre;
	private String Pri_Apellido;
	private String Seg_Apellido;
	private String Telefono;
	private String Sexo;
	private String Cargo;
	
	@ManyToOne
	@JoinColumn @JoinColumn(name="Id_Sucursal")
	@JsonBackReference
	private Sucursal sucursal;
	
	public Empleado() {}

	public Empleado(int dni_Empleado, String pri_Nombre, String seg_Nombre, String pri_Apellido, String seg_Apellido,
			String telefono, String sexo, String cargo, Sucursal sucursal) {
		super();
		Dni_Empleado = dni_Empleado;
		Pri_Nombre = pri_Nombre;
		Seg_Nombre = seg_Nombre;
		Pri_Apellido = pri_Apellido;
		Seg_Apellido = seg_Apellido;
		Telefono = telefono;
		Sexo = sexo;
		Cargo = cargo;
		this.sucursal = sucursal;
	}

	public int getDni_Empleado() {
		return Dni_Empleado;
	}

	public void setDni_Empleado(int dni_Empleado) {
		Dni_Empleado = dni_Empleado;
	}

	public String getPri_Nombre() {
		return Pri_Nombre;
	}

	public void setPri_Nombre(String pri_Nombre) {
		Pri_Nombre = pri_Nombre;
	}

	public String getSeg_Nombre() {
		return Seg_Nombre;
	}

	public void setSeg_Nombre(String seg_Nombre) {
		Seg_Nombre = seg_Nombre;
	}

	public String getPri_Apellido() {
		return Pri_Apellido;
	}

	public void setPri_Apellido(String pri_Apellido) {
		Pri_Apellido = pri_Apellido;
	}

	public String getSeg_Apellido() {
		return Seg_Apellido;
	}

	public void setSeg_Apellido(String seg_Apellido) {
		Seg_Apellido = seg_Apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
