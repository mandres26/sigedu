package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="sgcm_para")
public class Parametro {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_parametro_int_idparametro_seq")
    @SequenceGenerator(name="sgcm_parametro_int_idparametro_seq", sequenceName="sgcm_parametro_int_idparametro_seq", allocationSize=1)
	@Column(name="int_idparametro")
	private Integer int_idparametro;
	@Column(name="str_parametro")
	private String str_parametro;
	@Column(name="int_tipo_parametro")
	private Integer int_tipo_parametro;
	public Integer getInt_idparametro() {
		return int_idparametro;
	}
	public void setInt_idparametro(Integer int_idparametro) {
		this.int_idparametro = int_idparametro;
	}
	public String getStr_parametro() {
		return str_parametro;
	}
	public void setStr_parametro(String str_parametro) {
		this.str_parametro = str_parametro;
	}
	public Integer getInt_tipo_parametro() {
		return int_tipo_parametro;
	}
	public void setInt_tipo_parametro(Integer int_tipo_parametro) {
		this.int_tipo_parametro = int_tipo_parametro;
	}
	
	
}
