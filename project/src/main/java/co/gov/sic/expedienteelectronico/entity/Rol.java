package co.gov.sic.expedienteelectronico.entity;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Rol implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ROL_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ROL_ID_SEQ", name = "ROL_ID_GENERATOR")
	private Integer id;

	private java.lang.String codRol;

	private java.lang.String descRol;

	private java.lang.String sistema;

	public Rol() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getCodRol() {
		return this.codRol;
	}

	public void setCodRol(java.lang.String codRol) {
		this.codRol = codRol;
	}

	public java.lang.String getDescRol() {
		return this.descRol;
	}

	public void setDescRol(java.lang.String descRol) {
		this.descRol = descRol;
	}

	public java.lang.String getSistema() {
		return this.sistema;
	}

	public void setSistema(java.lang.String sistema) {
		this.sistema = sistema;
	}

	public Rol(java.lang.Integer id, java.lang.String codRol,
			java.lang.String descRol, java.lang.String sistema) {
		this.id = id;
		this.codRol = codRol;
		this.descRol = descRol;
		this.sistema = sistema;
	}

}