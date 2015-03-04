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
	private Integer codigo;
	@Column(name="str_curso")
	private String str_curso;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	//@Column(name="int_idarea")
	//private Area area;
	@Column(name="int_idestado")
	private Integer int_idestado;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getStr_curso() {
		return str_curso;
	}
	public void setStr_curso(String str_curso) {
		this.str_curso = str_curso;
	}
	public Integer getInt_idestado() {
		return int_idestado;
	}
	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
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
	/*public Integer getInt_idarea() {
		return int_idarea;
	}
	public void setInt_idarea(Integer int_idarea) {
		this.int_idarea = int_idarea;
	}*/
	
}
