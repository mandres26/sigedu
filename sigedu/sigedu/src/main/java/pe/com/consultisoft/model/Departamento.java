package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="sgcm_dpto")
public class Departamento {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_dpto_int_iddepartamento_seq")
    @SequenceGenerator(name="sgcm_dpto_int_iddepartamento_seq", sequenceName="sgcm_dpto_int_iddepartamento_seq", allocationSize=1)
	@Column(name="int_iddepartamento")
	private Integer id;
	@Column(name="str_departamento")
	private String nombre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
