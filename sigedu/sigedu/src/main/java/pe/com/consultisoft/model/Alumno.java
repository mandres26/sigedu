package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="alumno")
public class Alumno {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="alumno_codigo_seq")
    @SequenceGenerator(name="alumno_codigo_seq", sequenceName="alumno_codigo_seq", allocationSize=1)
	@Column(name="codigo")
	private Integer codigo;
	@Column(name="nombres")
	private String nombres;
	@Column(name="paterno")
	private String paterno;
	@Column(name="materno")
	private String materno;
	@Column(name="estado")
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
	
	
}
