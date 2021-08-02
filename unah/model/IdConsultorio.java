package edu.unah.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class IdConsultorio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Num_Consultorio;
	private Sucursal Id_Sucursal;
	
	public IdConsultorio() {}
	
	
	
	public IdConsultorio(int num_Consultorio, Sucursal id_Sucursal) {
		super();
		Num_Consultorio = num_Consultorio;
		Id_Sucursal = id_Sucursal;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdConsultorio) {
			IdConsultorio tmpid = (IdConsultorio)obj;
			if(this.Num_Consultorio == tmpid.getNum_Consultorio()
				&& this.Id_Sucursal == tmpid.getId_Sucursal()) {
				return true;
			}else return false;
		}else return false;	
	}
	
	public int hashCode() {
		return (int) this.Id_Sucursal.hashCode()+this.Num_Consultorio;
	}

	public int getNum_Consultorio() {
		return Num_Consultorio;
	}

	public void setNum_Consultorio(int num_Consultorio) {
		Num_Consultorio = num_Consultorio;
	}

	public Sucursal getId_Sucursal() {
		return Id_Sucursal;
	}

	public void setId_Sucursal(Sucursal id_Sucursal) {
		Id_Sucursal = id_Sucursal;
	}
	
	
	
}
