package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="sgcm_cole")
public class Colegio {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_cole_int_idcolegio_sep")
    @SequenceGenerator(name="sgcm_cole_int_idcolegio_sep", sequenceName="sgcm_cole_int_idcolegio_sep", allocationSize=1)
	@Column(name="int_idcolegio")
	private Integer int_idcolegio;
	@Column(name="str_colegio")
	private String str_colegio;
	@Column(name="str_telefono1")
	private String str_telefono1;
	@Column(name="str_telefono2")
	private String str_telefono2;
	@Column(name="str_celular")
	private String str_celular;
	@Column(name="str_direccion")
	private String str_direccion;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	@Column(name="int_cantidad_salones")
	private String int_cantidad_salones;
	//@Column(name="int_iddistrito")
	//private Distrito distrito;
	@Column(name="int_idusuario_creacion")
	private String int_idusuario_creacion;
	@Column(name="int_idusuario_modificacion")
	private String int_idusuario_modificacion;
	@Column(name="chr_estado")
	private String chr_estado;
	
	public Integer getInt_idcolegio() {
		return int_idcolegio;
	}
	public void setInt_idcolegio(Integer int_idcolegio) {
		this.int_idcolegio = int_idcolegio;
	}
	public String getStr_colegio() {
		return str_colegio;
	}
	public void setStr_colegio(String str_colegio) {
		this.str_colegio = str_colegio;
	}
	public String getStr_telefono1() {
		return str_telefono1;
	}
	public void setStr_telefono1(String str_telefono1) {
		this.str_telefono1 = str_telefono1;
	}
	public String getStr_telefono2() {
		return str_telefono2;
	}
	public void setStr_telefono2(String str_telefono2) {
		this.str_telefono2 = str_telefono2;
	}
	public String getStr_celular() {
		return str_celular;
	}
	public void setStr_celular(String str_celular) {
		this.str_celular = str_celular;
	}
	public String getStr_direccion() {
		return str_direccion;
	}
	public void setStr_direccion(String str_direccion) {
		this.str_direccion = str_direccion;
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
	public String getInt_cantidad_salones() {
		return int_cantidad_salones;
	}
	public void setInt_cantidad_salones(String int_cantidad_salones) {
		this.int_cantidad_salones = int_cantidad_salones;
	}
	/*public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}*/
	public String getInt_idusuario_creacion() {
		return int_idusuario_creacion;
	}
	public void setInt_idusuario_creacion(String int_idusuario_creacion) {
		this.int_idusuario_creacion = int_idusuario_creacion;
	}
	public String getInt_idusuario_modificacion() {
		return int_idusuario_modificacion;
	}
	public void setInt_idusuario_modificacion(String int_idusuario_modificacion) {
		this.int_idusuario_modificacion = int_idusuario_modificacion;
	}
	public String getChr_estado() {
		return chr_estado;
	}
	public void setChr_estado(String chr_estado) {
		this.chr_estado = chr_estado;
	}
	
}
