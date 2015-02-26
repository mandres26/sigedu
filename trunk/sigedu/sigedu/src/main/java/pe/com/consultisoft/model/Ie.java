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
@Table(name="sgcm_ie")
public class Ie {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_ie_int_idie_seq")
    @SequenceGenerator(name="sgcm_ie_int_idie_seq", sequenceName="sgcm_ie_int_idie_seq", allocationSize=1)
	@Column(name="int_idie")
	private Integer codigo;
	@Column(name="str_ie")
	private String str_ie;
	@Column(name="str_codigo_modular")
	private String str_codigo_modular;
	@Column(name="str_codigo_local")
	private String str_codigo_local;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idnivel")
	private Parametro nivel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idugel")
	private Parametro ugel;
		
	@Column(name="int_idusuario_creacion")
	private Integer int_idusuario_creacion;
	@Column(name="int_idusuario_modificacion")
	private Integer int_idusuario_modificacion;
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="int_idcolegio")
	//private Colegio colegio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idmodalidad")
	private Parametro modalidad;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idgestion")
	private Parametro parametro;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idgenero")
	private Parametro genero;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idforma")
	private Parametro forma;
	@Column(name="str_res_autorizacion_func")
	private String str_res_autorizacion_func;
	@Column(name="str_resolucion_numero")
	private String str_resolucion_numero;
	@Column(name="str_telefono")
	private String str_telefono;
	@Column(name="str_fax")
	private String str_fax;
	@Column(name="str_pagina_web")
	private String str_pagina_web;
	@Column(name="str_email")
	private String str_email;
	@Column(name="dte_fecha_resolucion")
	private String dte_fecha_resolucion;
	@Column(name="str_dias_laborables")
	private String str_dias_laborables;
	@Column(name="str_turno")
	private String str_turno;
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="int_idestado")
	//private Parametro estado;
	@Column(name="int_idestado")
	private Integer int_idestado;
	
	
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
	public Parametro getParametro() {
		return parametro;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Parametro getNivel() {
		return nivel;
	}
	public void setNivel(Parametro nivel) {
		this.nivel = nivel;
	}
	public Parametro getUgel() {
		return ugel;
	}
	public void setUgel(Parametro ugel) {
		this.ugel = ugel;
	}
	public Parametro getModalidad() {
		return modalidad;
	}
	public void setModalidad(Parametro modalidad) {
		this.modalidad = modalidad;
	}
	public Parametro getGenero() {
		return genero;
	}
	public void setGenero(Parametro genero) {
		this.genero = genero;
	}
	public Parametro getForma() {
		return forma;
	}
	public void setForma(Parametro forma) {
		this.forma = forma;
	}
	
	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}
	public String getStr_ie() {
		return str_ie;
	}
	public void setStr_ie(String str_ie) {
		this.str_ie = str_ie;
	}
	
	public String getStr_codigo_modular() {
		return str_codigo_modular;
	}
	public void setStr_codigo_modular(String str_codigo_modular) {
		this.str_codigo_modular = str_codigo_modular;
	}
	public String getStr_codigo_local() {
		return str_codigo_local;
	}
	public void setStr_codigo_local(String str_codigo_local) {
		this.str_codigo_local = str_codigo_local;
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
	public String getStr_res_autorizacion_func() {
		return str_res_autorizacion_func;
	}
	public void setStr_res_autorizacion_func(String str_res_autorizacion_func) {
		this.str_res_autorizacion_func = str_res_autorizacion_func;
	}
	public String getStr_resolucion_numero() {
		return str_resolucion_numero;
	}
	public void setStr_resolucion_numero(String str_resolucion_numero) {
		this.str_resolucion_numero = str_resolucion_numero;
	}
	public String getStr_telefono() {
		return str_telefono;
	}
	public void setStr_telefono(String str_telefono) {
		this.str_telefono = str_telefono;
	}
	public String getStr_fax() {
		return str_fax;
	}
	public void setStr_fax(String str_fax) {
		this.str_fax = str_fax;
	}
	public String getStr_pagina_web() {
		return str_pagina_web;
	}
	public void setStr_pagina_web(String str_pagina_web) {
		this.str_pagina_web = str_pagina_web;
	}
	public String getStr_email() {
		return str_email;
	}
	public void setStr_email(String str_email) {
		this.str_email = str_email;
	}
	public String getDte_fecha_resolucion() {
		return dte_fecha_resolucion;
	}
	public void setDte_fecha_resolucion(String dte_fecha_resolucion) {
		this.dte_fecha_resolucion = dte_fecha_resolucion;
	}
	public String getStr_dias_laborables() {
		return str_dias_laborables;
	}
	public void setStr_dias_laborables(String str_dias_laborables) {
		this.str_dias_laborables = str_dias_laborables;
	}
	public String getStr_turno() {
		return str_turno;
	}
	public void setStr_turno(String str_turno) {
		this.str_turno = str_turno;
	}
	
	
	
	
}
