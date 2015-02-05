package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="sgcm_curri")
public class Curricula {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="curricula_codigo_seq")
    @SequenceGenerator(name="curricula_codigo_seq", sequenceName="curricula_codigo_seq", allocationSize=1)
	@Column(name="int_idcurricula")
	private Integer int_idcurricula;
	@Column(name="str_curricula")
	private String str_curricula;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	@Column(name="int_idusuario_creacion")
	private Integer int_idusuario_creacion;
	@Column(name="int_idusuario_modificacion")
	private Integer int_idusuario_modificacion;
	@Column(name="int_idequivalencia")
	private Integer int_idequivalencia;
	@Column(name="int_idanho")
	private Integer int_idanho;
	@Column(name="int_idestado")
	private Integer int_idestado;
	public Integer getInt_idcurricula() {
		return int_idcurricula;
	}
	public void setInt_idcurricula(Integer int_idcurricula) {
		this.int_idcurricula = int_idcurricula;
	}
	public String getStr_curricula() {
		return str_curricula;
	}
	public void setStr_curricula(String str_curricula) {
		this.str_curricula = str_curricula;
	}
	public String getDte_fecha_creacion() {
		return dte_fecha_creacion;
	}
	public void setDte_fecha_creacion(String dte_fecha_creacion) {
		this.dte_fecha_creacion = dte_fecha_creacion;
	}
	public String getDte_fecha_modificacion() {
		return dte_fecha_modificacion;
	}
	public void setDte_fecha_modificacion(String dte_fecha_modificacion) {
		this.dte_fecha_modificacion = dte_fecha_modificacion;
	}
	public Integer getInt_idusuario_creacion() {
		return int_idusuario_creacion;
	}
	public void setInt_idusuario_creacion(Integer int_idusuario_creacion) {
		this.int_idusuario_creacion = int_idusuario_creacion;
	}
	public Integer getInt_idusuario_modificacion() {
		return int_idusuario_modificacion;
	}
	public void setInt_idusuario_modificacion(Integer int_idusuario_modificacion) {
		this.int_idusuario_modificacion = int_idusuario_modificacion;
	}
	public Integer getInt_idequivalencia() {
		return int_idequivalencia;
	}
	public void setInt_idequivalencia(Integer int_idequivalencia) {
		this.int_idequivalencia = int_idequivalencia;
	}
	public Integer getInt_idanho() {
		return int_idanho;
	}
	public void setInt_idanho(Integer int_idanho) {
		this.int_idanho = int_idanho;
	}
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
	
	
}
