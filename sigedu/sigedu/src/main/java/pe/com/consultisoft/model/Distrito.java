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
@Table(name="sgcm_dist")
public class Distrito {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_dist_int_iddistrito_seq")
    @SequenceGenerator(name="sgcm_dist_int_iddistrito_seq", sequenceName="sgcm_dist_int_iddistrito_seq", allocationSize=1)
	@Column(name="int_iddistrito")
	private Integer id;
	@Column(name="str_distrito")
	private String nombre;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idprovincia")
	private Provincia provincia;
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
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	
}
