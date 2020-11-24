package co.gov.sic.expedienteelectronico.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class PersonaDocumento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PERSONADOCUMENTO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@javax.persistence.SequenceGenerator(sequenceName = "PERSONADOCUMENTO_ID_SEQ", name = "PERSONADOCUMENTO_ID_GENERATOR")
	private co.gov.sic.expedienteelectronico.entity.Persona codDestinatario;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private co.gov.sic.expedienteelectronico.entity.Documento codDocumento;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private co.gov.sic.expedienteelectronico.entity.TipoNotiDestinatario codTipoNotificacion;

	public PersonaDocumento() {
	}

	public co.gov.sic.expedienteelectronico.entity.Persona getCodDestinatario() {
		return this.codDestinatario;
	}

	public void setCodDestinatario(
			co.gov.sic.expedienteelectronico.entity.Persona codDestinatario) {
		this.codDestinatario = codDestinatario;
	}

	public co.gov.sic.expedienteelectronico.entity.Documento getCodDocumento() {
		return this.codDocumento;
	}

	public void setCodDocumento(
			co.gov.sic.expedienteelectronico.entity.Documento codDocumento) {
		this.codDocumento = codDocumento;
	}

	public co.gov.sic.expedienteelectronico.entity.TipoNotiDestinatario getCodTipoNotificacion() {
		return this.codTipoNotificacion;
	}

	public void setCodTipoNotificacion(
			co.gov.sic.expedienteelectronico.entity.TipoNotiDestinatario codTipoNotificacion) {
		this.codTipoNotificacion = codTipoNotificacion;
	}

	public PersonaDocumento(
			co.gov.sic.expedienteelectronico.entity.Persona codDestinatario,
			co.gov.sic.expedienteelectronico.entity.Documento codDocumento,
			co.gov.sic.expedienteelectronico.entity.TipoNotiDestinatario codTipoNotificacion
			) {
		this.codDestinatario = codDestinatario;
		this.codDocumento = codDocumento;
		this.codTipoNotificacion = codTipoNotificacion;
	}

}