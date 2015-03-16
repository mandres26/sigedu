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
@Table(name="sgcm_prov")
public class Provincia {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_prov_int_idprovincia_seq")
    @SequenceGenerator(name="sgcm_prov_int_idprovincia_seq", sequenceName="sgcm_prov_int_idprovincia_seq", allocationSize=1)
	@Column(name="int_idprovincia")
	private Integer id;
	@Column(name="str_provincia")
	private String nombre;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="int_iddepartamento")
	private Departamento departamento;
	
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
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
