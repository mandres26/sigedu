package pe.com.consultisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="scgm_nota")
public class Nota {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="scgm_nota_int_idnotas_seq")
    @SequenceGenerator(name="scgm_nota_int_idnotas_seq", sequenceName="scgm_nota_int_idnotas_seq", allocationSize=1)
	@Column(name="int_idnotas")
	private Integer int_idnotas;
	@Column(name="int_nota")
	private Integer int_nota;
	@Column(name="int_idcurso")
	private Integer int_idcurso;
	@Column(name="int_idmatricula")
	private Integer int_idmatricula;
	@Column(name="int_idestado")
	private Integer int_idestado;
	public Integer getInt_idnotas() {
		return int_idnotas;
	}
	public void setInt_idnotas(Integer int_idnotas) {
		this.int_idnotas = int_idnotas;
	}
	public Integer getInt_nota() {
		return int_nota;
	}
	public void setInt_nota(Integer int_nota) {
		this.int_nota = int_nota;
	}
	public Integer getInt_idcurso() {
		return int_idcurso;
	}
	public void setInt_idcurso(Integer int_idcurso) {
		this.int_idcurso = int_idcurso;
	}
	public Integer getInt_idmatricula() {
		return int_idmatricula;
	}
	public void setInt_idmatricula(Integer int_idmatricula) {
		this.int_idmatricula = int_idmatricula;
	}
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
	
}