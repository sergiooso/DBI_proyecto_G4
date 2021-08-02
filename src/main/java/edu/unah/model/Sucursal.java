package edu.unah.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Sucursal")

public class Sucursal {
	
	@Id
	private int Id_Sucursal;
	
	private String Direccion;
	private String Avenida;
	private String Calle;
	private String Ciudad;
	private String Telefono;
	
	@OneToMany(mappedBy="Sucursal",fetch=FetchType.EAGER)
	private List<Empleado> empleado;
	
	@OneToMany(mappedBy="Sucursal",fetch=FetchType.EAGER)
	private List<Consultorio> consultorio;
	
	@OneToOne(mappedBy="Sucursal",fetch=FetchType.EAGER)
	private List<Odontologo> odontologo;
	
	
	public Sucursal () {}

	public Sucursal(int id_Sucursal, String direccion, String avenida, String calle, String ciudad, String telefono) {
		super();
		Id_Sucursal = id_Sucursal;
		Direccion = direccion;
		Avenida = avenida;
		Calle = calle;
		Ciudad = ciudad;
		Telefono = telefono;
	}

	public int getId_Sucursal() {
		return Id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		Id_Sucursal = id_Sucursal;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getAvenida() {
		return Avenida;
	}

	public void setAvenida(String avenida) {
		Avenida = avenida;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	public List<Consultorio> getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(List<Consultorio> consultorio) {
		this.consultorio = consultorio;
	}

	public List<Odontologo> getOdontologo() {
		return odontologo;
	}

	public void setOdontologo(List<Odontologo> odontologo) {
		this.odontologo = odontologo;
	}
	
	

}


