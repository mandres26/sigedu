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
@Table(name="sgcm_plc")
public class Plc {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_plc_int_idplc_seq")
    @SequenceGenerator(name="sgcm_plc_int_idplc_seq", sequenceName="sgcm_plc_int_idplc_seq", allocationSize=1)
	@Column(name="int_idplc")
	private Integer codigo;
	@Column(name="str_plc")
	private String str_plc;
	@Column(name="dte_fecha_inicio")
	private String dte_fecha_inicio;
	@Column(name="dte_fecha_fin")
	private String dte_fecha_fin;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idanho")
	private Anho anho;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="int_idestado")
	//private Parametro estado;
	
	@Column(name="int_idestado")
	private Integer int_idestado;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getStr_plc() {
		return str_plc;
	}
	public void setStr_plc(String str_plc) {
		this.str_plc = str_plc;
	}
	public String getDte_fecha_inicio() {
		return dte_fecha_inicio;
	}
	public void setDte_fecha_inicio(String dte_fecha_inicio) {
		this.dte_fecha_inicio = dte_fecha_inicio;
	}
	public String getDte_fecha_fin() {
		return dte_fecha_fin;
	}
	public void setDte_fecha_fin(String dte_fecha_fin) {
		this.dte_fecha_fin = dte_fecha_fin;
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
	public Anho getAnho() {
		return anho;
	}
	public void setAnho(Anho anho) {
		this.anho = anho;
	}
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
	
	/*
	public Parametro getEstado() {
		return estado;
	}
	public void setEstado(Parametro estado) {
		this.estado = estado;
	}
	*/
	
	
}
