package edu.unah.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Paciente")
public class Paciente {
	
	@Id
	private int Id_Paciente;
	
	private String Pri_Nombre;
	private String Seg_Nombre;
	private String Pri_Apellido;
	private String Seg_Apellido;
	private String Telefono;
	private String Correo;
	private String Direccion;
	private LocalDate Fecha_Nac;
	private String Contrasenia;
	
	@OneToOne(mappedBy="Paciente", fetch=FetchType.EAGER)
	private List<Expediente> expediente;
	
	@OneToOne(mappedBy="Paciente",fetch=FetchType.EAGER)
	private List<Receta_Medica> receta_medica;
	
	@OneToOne(mappedBy="Paciente",fetch=FetchType.EAGER)
	private List<Factura> factura;
	
	@OneToOne(mappedBy="Paciente",fetch=FetchType.EAGER)
	private List<Consulta> consulta;
	
	public Paciente() {}

	public Paciente(int id_Paciente, String pri_Nombre, String seg_Nombre, String pri_Apellido, String seg_Apellido,
			String telefono, String correo, String direccion, LocalDate fecha_Nac, String contrasenia) {
		super();
		Id_Paciente = id_Paciente;
		Pri_Nombre = pri_Nombre;
		Seg_Nombre = seg_Nombre;
		Pri_Apellido = pri_Apellido;
		Seg_Apellido = seg_Apellido;
		Telefono = telefono;
		Correo = correo;
		Direccion = direccion;
		Fecha_Nac = fecha_Nac;
		Contrasenia = contrasenia;

	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public int getId_Paciente() {
		return Id_Paciente;
	}

	public void setId_Paciente(int id_Paciente) {
		Id_Paciente = id_Paciente;
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

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public LocalDate getFecha_Nac() {
		return Fecha_Nac;
	}

	public void setFecha_Nac(LocalDate fecha_Nac) {
		Fecha_Nac = fecha_Nac;
	}

	public List<Expediente> getExpediente() {
		return expediente;
	}

	public void setExpediente(List<Expediente> expediente) {
		this.expediente = expediente;
	}

	public List<Receta_Medica> getReceta_medica() {
		return receta_medica;
	}

	public void setReceta_medica(List<Receta_Medica> receta_medica) {
		this.receta_medica = receta_medica;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}
	
	
	
}	
	