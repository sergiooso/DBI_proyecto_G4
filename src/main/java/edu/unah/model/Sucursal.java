package edu.unah.model;






import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SUCURSAL")
public class Sucursal {
	@Id
	private int IdSucursal;

	private String Direccion;
	private String Avenida;
	private String Calle;
	private String Ciudad;
	private String Telefono;
	
	public Sucursal() {}
	
	public Sucursal(int idSucursal, String direccion, String avenida, String calle, String ciudad, String telefono) {
		super();
		this.IdSucursal = idSucursal;
		this.Direccion = direccion;
		this.Avenida = avenida;
		this.Calle = calle;
		this.Ciudad = ciudad;
		this.Telefono = telefono;
	}
	public int getIdSucursal() {
		return IdSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		IdSucursal = idSucursal;
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

	
	
}
