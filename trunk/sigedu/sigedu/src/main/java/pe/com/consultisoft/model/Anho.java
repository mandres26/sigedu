package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="sgcm_anho")
public class Anho {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_anho_int_idanho_seq")
    @SequenceGenerator(name="sgcm_anho_int_idanho_seq", sequenceName="sgcm_anho_int_idanho_seq", allocationSize=1)
	@Column(name="int_idanho")
	private Integer int_idanho;
	@Column(name="str_anho")
	private String str_anho;
	@Column(name="str_anho_actual")
	private String str_anho_actual;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idestado")
	private Parametro estado;
	
	
	
	public Integer getInt_idanho() {
		return int_idanho;
	}
	public void setInt_idanho(Integer int_idanho) {
		this.int_idanho = int_idanho;
	}
	public String getStr_anho() {
		return str_anho;
	}
	public void setStr_anho(String str_anho) {
		this.str_anho = str_anho;
	}
	public String getStr_anho_actual() {
		return str_anho_actual;
	}
	public void setStr_anho_actual(String str_anho_actual) {
		this.str_anho_actual = str_anho_actual;
	}
	public Parametro getEstado() {
		return estado;
	}
	public void setEstado(Parametro estado) {
		this.estado = estado;
	}	
	
	
}
