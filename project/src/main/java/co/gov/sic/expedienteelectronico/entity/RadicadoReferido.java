package co.gov.sic.expedienteelectronico.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RadicadoReferido implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "RADICADOREFERIDO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "RADICADOREFERIDO_ID_SEQ", name = "RADICADOREFERIDO_ID_GENERATOR")
	private java.lang.Integer numeroRadicado;

	private java.lang.String descRadicado;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private co.gov.sic.expedienteelectronico.entity.Documento codDocumento;

	public RadicadoReferido() {
	}

	public java.lang.Integer getNumeroRadicado() {
		return this.numeroRadicado;
	}

	public void setNumeroRadicado(java.lang.Integer numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}

	public java.lang.String getDescRadicado() {
		return this.descRadicado;
	}

	public void setDescRadicado(java.lang.String descRadicado) {
		this.descRadicado = descRadicado;
	}

	public co.gov.sic.expedienteelectronico.entity.Documento getCodDocumento() {
		return this.codDocumento;
	}

	public void setCodDocumento(
			co.gov.sic.expedienteelectronico.entity.Documento codDocumento) {
		this.codDocumento = codDocumento;
	}

	public RadicadoReferido(java.lang.Integer numeroRadicado,
			java.lang.String descRadicado,
			co.gov.sic.expedienteelectronico.entity.Documento codDocumento) {
		this.numeroRadicado = numeroRadicado;
		this.descRadicado = descRadicado;
		this.codDocumento = codDocumento;
	}

}