package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="curricula")
public class Curricula {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="curricula_codigo_seq")
    @SequenceGenerator(name="curricula_codigo_seq", sequenceName="curricula_codigo_seq", allocationSize=1)
	@Column(name="codigo")
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="curso")
	private String curso;
	@Column(name="grado")
	private String grado;
	@Column(name="colegio")
	private String colegio;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getColegio() {
		return colegio;
	}
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
