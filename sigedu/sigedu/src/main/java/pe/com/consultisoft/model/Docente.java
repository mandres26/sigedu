package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="sgcm_doct")
public class Docente {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_doct_int_iddocente_seq")
    @SequenceGenerator(name="sgcm_doct_int_iddocente_seq", sequenceName="sgcm_doct_int_iddocente_seq", allocationSize=1)
	@Column(name="int_iddocente")
	private Integer int_iddocente;
	@Column(name="str_nombre")
	private String str_nombre;
	@Column(name="str_apellido_paterno")
	private String str_apellido_paterno;
	@Column(name="str_apellido_materno")
	private String str_apellido_materno;
/*	@Column(name="str_direccion")
	private String str_direccion;
	@Column(name="str_telefono")
	private String str_telefono;
	@Column(name="str_celular")
	private String str_celular;
	@Column(name="str_email")
	private String str_email;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	@Column(name="str_dni")
	private String str_dni;
	@Column(name="int_iddistrito")
	private Integer int_iddistrito;
	@Column(name="dte_fecha_nacimiento")
	private String dte_fecha_nacimiento;
	@Column(name="int_idusuario_creacion")
	private Integer int_idusuario_creacion;
	@Column(name="int_idusuario_modificacion")
	private Integer int_idusuario_modificacion;*/
	@Column(name="int_idestado")
	private Integer int_idestado;
	public Integer getInt_iddocente() {
		return int_iddocente;
	}
	public void setInt_iddocente(Integer int_iddocente) {
		this.int_iddocente = int_iddocente;
	}
	public String getStr_nombre() {
		return str_nombre;
	}
	public void setStr_nombre(String str_nombre) {
		this.str_nombre = str_nombre;
	}
	public String getStr_apellido_paterno() {
		return str_apellido_paterno;
	}
	public void setStr_apellido_paterno(String str_apellido_paterno) {
		this.str_apellido_paterno = str_apellido_paterno;
	}
	public String getStr_apellido_materno() {
		return str_apellido_materno;
	}
	public void setStr_apellido_materno(String str_apellido_materno) {
		this.str_apellido_materno = str_apellido_materno;
	}
/*	public String getStr_direccion() {
		return str_direccion;
	}
	public void setStr_direccion(String str_direccion) {
		this.str_direccion = str_direccion;
	}
	public String getStr_telefono() {
		return str_telefono;
	}
	public void setStr_telefono(String str_telefono) {
		this.str_telefono = str_telefono;
	}
	public String getStr_celular() {
		return str_celular;
	}
	public void setStr_celular(String str_celular) {
		this.str_celular = str_celular;
	}
	public String getStr_email() {
		return str_email;
	}
	public void setStr_email(String str_email) {
		this.str_email = str_email;
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
	public String getStr_dni() {
		return str_dni;
	}
	public void setStr_dni(String str_dni) {
		this.str_dni = str_dni;
	}
	public Integer getInt_iddistrito() {
		return int_iddistrito;
	}
	public void setInt_iddistrito(Integer int_iddistrito) {
		this.int_iddistrito = int_iddistrito;
	}
	public String getDte_fecha_nacimiento() {
		return dte_fecha_nacimiento;
	}
	public void setDte_fecha_nacimiento(String dte_fecha_nacimiento) {
		this.dte_fecha_nacimiento = dte_fecha_nacimiento;
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
	}*/
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
	
}