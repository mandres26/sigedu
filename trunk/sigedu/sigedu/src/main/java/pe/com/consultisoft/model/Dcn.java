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
@Table(name="sgcm_dcn")
public class Dcn {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sgcm_dcn_int_iddcn_seq")
    @SequenceGenerator(name="sgcm_dcn_int_iddcn_seq", sequenceName="sgcm_dcn_int_iddcn_seq", allocationSize=1)
	@Column(name="int_iddcn")
	private Integer int_iddcn;
	@Column(name="str_dcn")
	private String str_dcn;
	@Column(name="dte_fecha_inicio_vig")
	private String dte_fecha_inicio_vig;
	@Column(name="dte_fecha_fin_vig")
	private String dte_fecha_fin_vig;
	@Column(name="dte_fecha_creacion")
	private String dte_fecha_creacion;
	@Column(name="dte_fecha_modificacion")
	private String dte_fecha_modificacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="int_idparametro")
	private Parametro parametro;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@Column(name="int_idtipo_centro")
	//private Tipocentro tipocentro;
	@Column(name="int_idestado")
	private Integer int_idestado;

	
	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public Integer getInt_iddcn() {
		return int_iddcn;
	}

	public void setInt_iddcn(Integer int_iddcn) {
		this.int_iddcn = int_iddcn;
	}

	public String getStr_dcn() {
		return str_dcn;
	}

	public void setStr_dcn(String str_dcn) {
		this.str_dcn = str_dcn;
	}

	public String getDte_fecha_inicio_vig() {
		return dte_fecha_inicio_vig;
	}

	public void setDte_fecha_inicio_vig(String dte_fecha_inicio_vig) {
		this.dte_fecha_inicio_vig = dte_fecha_inicio_vig;
	}

	public String getDte_fecha_fin_vig() {
		return dte_fecha_fin_vig;
	}

	public void setDte_fecha_fin_vig(String dte_fecha_fin_vig) {
		this.dte_fecha_fin_vig = dte_fecha_fin_vig;
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

	public Integer getInt_idestado() {
		return int_idestado;
	}

	public void setInt_idestado(Integer int_idestado) {
		this.int_idestado = int_idestado;
	}
}
