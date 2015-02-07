package pe.com.consultisoft.model;

import java.util.Date;

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
@Table(name="sgtc_alum")
public class Alumno {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="alumno_codigo_seq")
    @SequenceGenerator(name="alumno_codigo_seq", sequenceName="alumno_codigo_seq", allocationSize=1)
	@Column(name="int_idalumno")
	private Integer codigo;
	@Column(name="str_nombre")
	private String nombres;
	@Column(name="str_apellido_paterno")
	private String paterno;
	@Column(name="str_apellido_materno")
	private String materno;
	@Column(name="str_direccion")
	private String direccion;
	@Column(name="str_telefono")
	private String telefono;
	@Column(name="str_celular")
	private String celular;
	@Column(name="str_email")
	private String email;
	@Column(name="str_dni")
	private String dni;
	@Column(name="dte_fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name="int_idsexo")
	private int sexo;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_iddistrito")
	private Distrito distrito;
	@Column(name="int_idpadre_apoderado")
	private int apoderado;
	@Column(name="dte_fecha_creacion")
	private Date fechaCreacion;
	@Column(name="int_idusuario_creacion")
	private int usuarioCreacion;
	@Column(name="dte_fecha_modificacion")
	private Date fechaModificacion;
	@Column(name="int_idusuario_modificacion")
	private int usuarioModificacion;
	@Column(name="str_estado")
	private String estado;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public int getApoderado() {
		return apoderado;
	}
	public void setApoderado(int apoderado) {
		this.apoderado = apoderado;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public int getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public int getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(int usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
	
}
