package co.gov.sic.expedienteelectronico.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TipoDocumento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TIPODOCUMENTO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "TIPODOCUMENTO_ID_SEQ", name = "TIPODOCUMENTO_ID_GENERATOR")
	private Integer id;

	private java.lang.String codTipo;

	private java.lang.String descTipo;

	private java.lang.String estado;

	public TipoDocumento() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getCodTipo() {
		return this.codTipo;
	}

	public void setCodTipo(java.lang.String codTipo) {
		this.codTipo = codTipo;
	}

	public java.lang.String getDescTipo() {
		return this.descTipo;
	}

	public void setDescTipo(java.lang.String descTipo) {
		this.descTipo = descTipo;
	}

	public java.lang.String getEstado() {
		return this.estado;
	}

	public void setEstado(java.lang.String estado) {
		this.estado = estado;
	}

	public TipoDocumento(java.lang.Integer id, java.lang.String codTipo,
			java.lang.String descTipo, java.lang.String estado) {
		this.id = id;
		this.codTipo = codTipo;
		this.descTipo = descTipo;
		this.estado = estado;
	}

}