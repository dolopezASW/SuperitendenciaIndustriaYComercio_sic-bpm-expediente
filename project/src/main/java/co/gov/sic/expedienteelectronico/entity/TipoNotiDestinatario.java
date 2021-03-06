package co.gov.sic.expedienteelectronico.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TipoNotiDestinatario implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TIPONOTIDESTINATARIO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "TIPONOTIDESTINATARIO_ID_SEQ", name = "TIPONOTIDESTINATARIO_ID_GENERATOR")
	private Integer id;

	private java.lang.String codTipo;

	private java.lang.String descTipo;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private PersonaDocumento personaDocumentoList;

	public TipoNotiDestinatario() {
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

	public co.gov.sic.expedienteelectronico.entity.PersonaDocumento getPersonaDocumentoList() {
		return this.personaDocumentoList;
	}

	public void setPersonaDocumentoList(
			co.gov.sic.expedienteelectronico.entity.PersonaDocumento personaDocumentoList) {
		this.personaDocumentoList = personaDocumentoList;
	}

	public TipoNotiDestinatario(
			java.lang.Integer id,
			java.lang.String codTipo,
			java.lang.String descTipo,
			co.gov.sic.expedienteelectronico.entity.PersonaDocumento personaDocumentoList) {
		this.id = id;
		this.codTipo = codTipo;
		this.descTipo = descTipo;
		this.personaDocumentoList = personaDocumentoList;
	}

}