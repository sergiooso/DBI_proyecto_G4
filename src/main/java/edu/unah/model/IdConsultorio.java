package edu.unah.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializar", "handler"})
@Embeddable
public class IdConsultorio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int IdConsultorio;
	private int IdSucursal;
	
	
	public IdConsultorio() {}
	
	public IdConsultorio(int idConsultorio, int idSucursal) {
		super();
		IdConsultorio = idConsultorio;
		IdSucursal = idSucursal;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdConsultorio) {
			IdConsultorio tmpid = (IdConsultorio)obj;
			if(this.IdConsultorio == tmpid.getIdConsultorio()
			   && this.IdConsultorio == tmpid.getIdConsultorio()) {
				return true;
			}else 
				return false;
		}else
			return false;
	}
	
	public int hashcode() {
		return (int) this.IdConsultorio + this.IdSucursal;
	}

	public int getIdConsultorio() {
		return IdConsultorio;
	}

	public void setIdConsultorio(int idConsultorio) {
		IdConsultorio = idConsultorio;
	}

	public int getIdSucursal() {
		return IdSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		IdSucursal = idSucursal;
	}
	
}
