package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="sgcm_curs")
public class Asignatura {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_curs_int_idcurso_seq")
    @SequenceGenerator(name="sgcm_curs_int_idcurso_seq", sequenceName="sgcm_curs_int_idcurso_seq", allocationSize=1)
	@Column(name="int_idcurso")
	private Integer int_idcurso;
	@Column(name="str_curso")
	private String str_curso;
	@Column(name="estado")
	private String estado;
	public Integer getInt_idcurso() {
		return int_idcurso;
	}
	public void setInt_idcurso(Integer int_idcurso) {
		this.int_idcurso = int_idcurso;
	}
	public String getStr_curso() {
		return str_curso;
	}
	public void setStr_curso(String str_curso) {
		this.str_curso = str_curso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
