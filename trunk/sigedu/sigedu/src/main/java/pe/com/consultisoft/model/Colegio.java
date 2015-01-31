package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="colegio")
public class Colegio {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="colegio_codigo_seq")
    @SequenceGenerator(name="colegio_codigo_seq", sequenceName="colegio_codigo_seq", allocationSize=1)
	@Column(name="codigo")
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono1")
	private String telefono1;
	@Column(name="telefono2")
	private String telefono2;
	@Column(name="celular")
	private String celular;
	@Column(name="direccion")
	private String direccion;
	@Column(name="estado")
	private String estado;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono1() {
		return telefono1;
	}
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}
	
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
